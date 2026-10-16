package mesquite.messaging.model;

/* JADX INFO: loaded from: classes2.dex */
public class Container extends mesquite.messaging.model.BaseEntity {

    public static class Builder {
        private java.lang.String a;

        public Builder() {
            new java.util.ArrayList();
            new java.util.ArrayList();
        }

        public final mesquite.messaging.model.Container a() {
            java.lang.String str = this.a;
            defpackage.a.ak(str, "Container must be provided an ID.");
            return new mesquite.messaging.model.Container(str);
        }

        public final void b(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("Container IDs may not be an empty string.");
            }
            this.a = str;
        }
    }

    public Container(java.lang.String str) {
        super(str, "");
    }
}
