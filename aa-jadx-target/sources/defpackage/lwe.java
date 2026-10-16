package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwe implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MMMPermGranter");
    private final java.util.HashSet b = new java.util.HashSet();

    public static defpackage.lwe a() {
        return (defpackage.lwe) defpackage.mkp.a.b(defpackage.lwe.class, new defpackage.lqb(11));
    }

    public static boolean e(java.util.List list, java.lang.String str) {
        if (defpackage.acul.g().b.contains(str)) {
            defpackage.you youVarListIterator = ((defpackage.ygw) list).listIterator(0);
            while (youVarListIterator.hasNext()) {
                mesquite.messaging.model.Message message = (mesquite.messaging.model.Message) youVarListIterator.next();
                java.lang.String str2 = message.c;
                if (str2 != null && (str2.startsWith("audio") || str2.startsWith("image"))) {
                    android.net.Uri uri = message.d;
                    if (uri == null || uri.equals(android.net.Uri.EMPTY)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(androidx.car.app.messaging.model.ConversationItem conversationItem, java.lang.String str) {
        while (true) {
            boolean z = false;
            for (androidx.car.app.messaging.model.CarMessage carMessage : conversationItem.getMessages()) {
                if (f(carMessage.getMultimediaMimeType(), carMessage.getMultimediaUri(), str) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        android.content.Context context = defpackage.mkp.a.c;
        java.util.HashSet hashSet = this.b;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ep$.ExternalSyntheticApiModelOutline1.m(context, "com.google.android.googlequicksearchbox", (android.net.Uri) it.next(), 1);
        }
        ((defpackage.yqj) a.l().ai((char) 4368)).w("Revoked AGSA permissions to %d uris.", hashSet.size());
        hashSet.clear();
    }

    public final boolean f(java.lang.String str, android.net.Uri uri, java.lang.String str2) {
        android.content.Context context = defpackage.mkp.a.c;
        boolean z = str != null && str.startsWith("audio");
        boolean z2 = defpackage.acul.t() && str != null && str.startsWith("image");
        if (!z && !z2) {
            ((defpackage.yqj) a.l().ai((char) 4367)).y("Not an audio or image message. Mime type: %s", str);
            return false;
        }
        if (uri == null) {
            ((defpackage.yqj) a.l().ai((char) 4366)).u("No uri found in message.");
            return false;
        }
        java.util.HashSet hashSet = this.b;
        if (!hashSet.contains(uri)) {
            try {
                context.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
                ((defpackage.yqj) a.l().ai(4364)).u("Granted GSA image for description");
                hashSet.add(uri);
            } catch (java.lang.SecurityException e) {
                defpackage.zbd zbdVar = z2 ? defpackage.zbd.Lg : defpackage.zbd.KH;
                defpackage.lxy.e();
                defpackage.lxy.i(defpackage.zbe.MESSAGING, zbdVar, str2, 0L);
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai(4365)).y("Granting permission failed %s.", e);
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lhn
    public final void eQ() {
    }
}
