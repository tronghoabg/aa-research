package java.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class FileSystemException extends java.io.IOException {
    private final java.lang.String a;
    private final java.lang.String b;

    public FileSystemException(java.lang.String str) {
        super((java.lang.String) null);
        this.a = str;
        this.b = null;
    }

    public java.lang.String getFile() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        if (this.a == null && this.b == null) {
            return getReason();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a != null) {
            sb.append(this.a);
        }
        if (this.b != null) {
            sb.append(" -> ");
            sb.append(this.b);
        }
        if (getReason() != null) {
            sb.append(": ");
            sb.append(getReason());
        }
        return sb.toString();
    }

    public java.lang.String getOtherFile() {
        return this.b;
    }

    public java.lang.String getReason() {
        return super.getMessage();
    }

    public FileSystemException(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str3);
        this.a = str;
        this.b = str2;
    }
}
