package mesquite.messaging.model;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.a;
import defpackage.duk;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class Message extends BaseEntity {
    public final String c;
    public final Uri d;
    public final duk e;
    public final long f;

    public static class Builder {
        public duk a;
        public String b = "";
        public long c = -1;
        public String d;
        public Uri e;
        private String f;

        public Builder() {
            new ArrayList();
            new ArrayList();
        }

        public final Message a() {
            if (this.c < 0) {
                throw new IllegalArgumentException("Message received time must be set to a non-negative value.");
            }
            String str = this.f;
            a.al(str, "Message must be provided an ID.");
            duk dukVar = this.a;
            a.al(dukVar, "A message must have a sender");
            return new Message(str, dukVar, this.b, this.c, this.d, this.e);
        }

        public final void b(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Message IDs may not be an empty string.");
            }
            this.f = str;
        }
    }

    public Message(String str, duk dukVar, String str2, long j, String str3, Uri uri) {
        super(str, str2);
        this.c = str3;
        this.d = uri;
        this.e = dukVar;
        this.f = j;
    }
}
