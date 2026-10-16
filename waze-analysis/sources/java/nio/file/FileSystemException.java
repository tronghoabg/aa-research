package java.nio.file;

import java.io.IOException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class FileSystemException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final String f50740a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50741b;

    public FileSystemException(String str) {
        super((String) null);
        this.f50740a = str;
        this.f50741b = null;
    }

    public String getFile() {
        return this.f50740a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f50740a == null && this.f50741b == null) {
            return getReason();
        }
        StringBuilder sb = new StringBuilder();
        if (this.f50740a != null) {
            sb.append(this.f50740a);
        }
        if (this.f50741b != null) {
            sb.append(" -> ");
            sb.append(this.f50741b);
        }
        if (getReason() != null) {
            sb.append(": ");
            sb.append(getReason());
        }
        return sb.toString();
    }

    public String getOtherFile() {
        return this.f50741b;
    }

    public String getReason() {
        return super.getMessage();
    }

    public FileSystemException(String str, String str2, String str3) {
        super(str3);
        this.f50740a = str;
        this.f50741b = str2;
    }
}
