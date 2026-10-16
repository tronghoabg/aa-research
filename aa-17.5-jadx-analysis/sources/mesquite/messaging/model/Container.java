package mesquite.messaging.model;

import android.text.TextUtils;
import defpackage.a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Container extends BaseEntity {

    public static class Builder {
        private String a;

        public Builder() {
            new ArrayList();
            new ArrayList();
        }

        public final Container a() {
            String str = this.a;
            a.al(str, "Container must be provided an ID.");
            return new Container(str);
        }

        public final void b(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Container IDs may not be an empty string.");
            }
            this.a = str;
        }
    }

    public Container(String str) {
        super(str, "");
    }
}
