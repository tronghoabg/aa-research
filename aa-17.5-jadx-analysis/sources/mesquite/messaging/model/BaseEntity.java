package mesquite.messaging.model;

/* loaded from: classes2.dex */
public abstract class BaseEntity {
    public final String a;
    public final String b;

    public BaseEntity(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Entity IDs cannot be empty.");
        }
        this.a = str;
        this.b = str2;
    }
}
