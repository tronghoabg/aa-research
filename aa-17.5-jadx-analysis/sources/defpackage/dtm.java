package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class dtm extends duc {
    public duk b;
    public CharSequence c;
    private Boolean e;
    public final List a = new ArrayList();
    private final List d = new ArrayList();

    public dtm(duk dukVar) {
        if (TextUtils.isEmpty(dukVar.a)) {
            throw new IllegalArgumentException("User's name must not be empty.");
        }
        this.b = dukVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dtm f(android.app.Notification r4) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtm.f(android.app.Notification):dtm");
    }

    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.duc
    protected final void b(Bundle bundle) {
        super.b(bundle);
        List list = this.a;
        list.clear();
        duk dukVarC = bundle.containsKey("android.messagingUser") ? dti.c(bundle, "android.messagingUser") : null;
        if (dukVarC != null) {
            this.b = dukVarC;
        } else if (bundle.containsKey("android.messagingStyleUser")) {
            this.b = duk.b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            duj dujVar = new duj();
            dujVar.a = bundle.getString("android.selfDisplayName");
            this.b = new duk(dujVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.c = charSequence;
        if (charSequence == null) {
            this.c = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(dtl.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.d.addAll(dtl.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    @Override // defpackage.duc
    public final void c(mko mkoVar) {
        h(g());
        Notification.MessagingStyle messagingStyleA = dti.a(dsy.b(this.b));
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            dtg.a(messagingStyleA, ((dtl) it.next()).a());
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            dth.a(messagingStyleA, ((dtl) it2.next()).a());
        }
        this.e.booleanValue();
        dtg.b(messagingStyleA, this.c);
        dti.b(messagingStyleA, this.e.booleanValue());
        messagingStyleA.setBuilder((Notification.Builder) mkoVar.d);
    }

    public final boolean g() {
        dsx dsxVar = this.g;
        if (dsxVar != null && dsxVar.a.getApplicationInfo().targetSdkVersion < 28 && this.e == null) {
            return this.c != null;
        }
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void h(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public dtm() {
    }
}
