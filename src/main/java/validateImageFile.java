import java.util.List;

public class validateImageFile {


    public final static List<String> ALLDWED_EXTENSIONS = List.of("jpg","jpeg","png","gif");

    private void validateImageFile(MultipartFile file){
        if(file.isEmpty()){
            throw new IllegalArgumentException("파일이 비어 있습니다.");
        }

        String fileName = file.getOriginalFilename();

        String extension =fileName.substring(fileName.lastIndexOf(".")+1).toLowerCase();

        if(!ALLDWED_EXTENSIONS.contains(extension)){
            throw new IllegalArgumentException("허용되지 않은 확장자");
        }

        String contentType = file.getContentType();

        if(contentType == null || !contentType.startsWith("image/")){
            System.out.println(contentType);
            throw new IllegalArgumentException("이미지 파일만 업로드 가능");
        }//*/

    }

}
