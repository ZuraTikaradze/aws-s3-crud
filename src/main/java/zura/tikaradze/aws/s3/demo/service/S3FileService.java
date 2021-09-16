package zura.tikaradze.aws.s3.demo.service;


import org.springframework.web.multipart.MultipartFile;

public interface S3FileService {
    String uploadFile(MultipartFile file);

    byte[] downloadFile(String fileName);

    String deleteFile(String fileName);
}
