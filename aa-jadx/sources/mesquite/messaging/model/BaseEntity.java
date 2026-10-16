package mesquite.messaging.model;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseEntity {
    public final java.lang.String a;
    public final java.lang.String b;

    public BaseEntity(java.lang.String str, java.lang.String str2) {
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Entity IDs cannot be empty.");
        }
        this.a = str;
        this.b = str2;
    }
}
