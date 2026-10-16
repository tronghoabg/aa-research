package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationItem;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final class lvx implements lhg {
    public static final yph a = yph.c("GH.MMMPermGranter");
    private final HashSet b = new HashSet();

    public static lvx a() {
        return (lvx) mki.a.b(lvx.class, new lpu(11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(List list, String str) {
        if (actj.g().b.contains(str)) {
            ynp ynpVarListIterator = ((yfq) list).listIterator(0);
            while (ynpVarListIterator.hasNext()) {
                Message message = (Message) ynpVarListIterator.next();
                String str2 = message.c;
                if (str2 != null && (str2.startsWith("audio") || str2.startsWith("image"))) {
                    Uri uri = message.d;
                    if (uri == null || uri.equals(Uri.EMPTY)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(ConversationItem conversationItem, String str) {
        boolean z;
        while (true) {
            for (CarMessage carMessage : conversationItem.getMessages()) {
                z = f(carMessage.getMultimediaMimeType(), carMessage.getMultimediaUri(), str) || z;
            }
            return z;
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        Context context = mki.a.c;
        HashSet hashSet = this.b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            context.revokeUriPermission(RemoteApiConstants.NOW_PACKAGE, (Uri) it.next(), 1);
        }
        ((ype) a.l().ai((char) 4365)).w("Revoked AGSA permissions to %d uris.", hashSet.size());
        hashSet.clear();
    }

    public final boolean f(String str, Uri uri, String str2) {
        Context context = mki.a.c;
        boolean z = str != null && str.startsWith("audio");
        boolean z2 = actj.t() && str != null && str.startsWith("image");
        if (!z && !z2) {
            ((ype) a.l().ai((char) 4364)).y("Not an audio or image message. Mime type: %s", str);
            return false;
        }
        if (uri == null) {
            ((ype) a.l().ai((char) 4363)).u("No uri found in message.");
            return false;
        }
        HashSet hashSet = this.b;
        if (!hashSet.contains(uri)) {
            try {
                context.grantUriPermission(RemoteApiConstants.NOW_PACKAGE, uri, 1);
                ((ype) a.l().ai(4361)).u("Granted GSA image for description");
                hashSet.add(uri);
            } catch (SecurityException e) {
                yzy yzyVar = z2 ? yzy.Lc : yzy.KD;
                lxr.e();
                lxr.i(yzz.MESSAGING, yzyVar, str2);
                ((ype) ((ype) ((ype) a.h()).p(e)).ai(4362)).y("Granting permission failed %s.", e);
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
