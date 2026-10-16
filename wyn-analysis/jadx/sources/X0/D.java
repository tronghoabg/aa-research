package X0;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import i1.C2840b;
import java.util.ArrayList;
import java.util.Iterator;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class D extends E {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15782e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f15783f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Q f15784g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f15785h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f15786i;

    public D() {
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X0.D j(android.app.Notification r6) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.D.j(android.app.Notification):X0.D");
    }

    @Override // X0.E
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f15784g.f15813a);
        bundle.putBundle("android.messagingStyleUser", this.f15784g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f15785h);
        if (this.f15785h != null && this.f15786i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f15785h);
        }
        ArrayList arrayList = this.f15782e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", C.a(arrayList));
        }
        ArrayList arrayList2 = this.f15783f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C.a(arrayList2));
        }
        Boolean bool = this.f15786i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // X0.E
    public final void b(N2.j jVar) {
        C c10;
        boolean z2;
        Notification.MessagingStyle messagingStyleB;
        this.f15786i = Boolean.valueOf(k());
        int i5 = Build.VERSION.SDK_INT;
        ArrayList arrayList = this.f15782e;
        Notification.Builder builder = (Notification.Builder) jVar.f8381d;
        if (i5 >= 24) {
            if (i5 >= 28) {
                Q q4 = this.f15784g;
                q4.getClass();
                messagingStyleB = z.a(H.d(q4));
            } else {
                messagingStyleB = x.b(this.f15784g.f15813a);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x.a(W1.p.f(messagingStyleB), ((C) it.next()).c());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f15783f.iterator();
                while (it2.hasNext()) {
                    y.a(W1.p.f(messagingStyleB), ((C) it2.next()).c());
                }
            }
            if (this.f15786i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                x.c(W1.p.f(messagingStyleB), this.f15785h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z.b(W1.p.f(messagingStyleB), this.f15786i.booleanValue());
            }
            messagingStyleB.setBuilder(builder);
            return;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                c10 = (C) arrayList.get(size);
                Q q10 = c10.f15778c;
                if (q10 != null && !TextUtils.isEmpty(q10.f15813a)) {
                    break;
                } else {
                    size--;
                }
            } else {
                c10 = !arrayList.isEmpty() ? (C) AbstractC3256n.e(arrayList, 1) : null;
            }
        }
        if (this.f15785h != null && this.f15786i.booleanValue()) {
            builder.setContentTitle(this.f15785h);
        } else if (c10 != null) {
            builder.setContentTitle("");
            Q q11 = c10.f15778c;
            if (q11 != null) {
                builder.setContentTitle(q11.f15813a);
            }
        }
        if (c10 != null) {
            builder.setContentText(this.f15785h != null ? l(c10) : c10.f15776a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f15785h != null) {
            z2 = true;
            break;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            Q q12 = ((C) arrayList.get(size2)).f15778c;
            if (q12 != null && q12.f15813a == null) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            C c11 = (C) arrayList.get(size3);
            CharSequence charSequenceL = z2 ? l(c11) : c11.f15776a;
            if (size3 != arrayList.size() - 1) {
                spannableStringBuilder.insert(0, (CharSequence) "\n");
            }
            spannableStringBuilder.insert(0, charSequenceL);
        }
        new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
    }

    @Override // X0.E
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // X0.E
    public final void i(Bundle bundle) {
        super.i(bundle);
        ArrayList arrayList = this.f15782e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f15784g = Q.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            Q q4 = new Q();
            q4.f15813a = string;
            q4.f15814b = null;
            q4.f15815c = null;
            q4.f15816d = null;
            q4.f15817e = false;
            q4.f15818f = false;
            this.f15784g = q4;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f15785h = charSequence;
        if (charSequence == null) {
            this.f15785h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(C.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f15783f.addAll(C.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f15786i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final boolean k() {
        C1289q c1289q = (C1289q) this.f15788b;
        if (c1289q != null && c1289q.f15874a.getApplicationInfo().targetSdkVersion < 28 && this.f15786i == null) {
            return this.f15785h != null;
        }
        Boolean bool = this.f15786i;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final SpannableStringBuilder l(C c10) {
        C2840b c2840bC = C2840b.c();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Q q4 = c10.f15778c;
        CharSequence charSequence = q4 == null ? "" : q4.f15813a;
        int i5 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f15784g.f15813a;
            int i10 = ((C1289q) this.f15788b).f15898z;
            if (i10 != 0) {
                i5 = i10;
            }
        }
        c2840bC.getClass();
        E4.F f10 = i1.f.f36716a;
        SpannableStringBuilder spannableStringBuilderD = c2840bC.d(charSequence);
        spannableStringBuilder.append((CharSequence) spannableStringBuilderD);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i5), null), spannableStringBuilder.length() - spannableStringBuilderD.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = c10.f15776a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) c2840bC.d(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    public D(Q q4) {
        if (!TextUtils.isEmpty(q4.f15813a)) {
            this.f15784g = q4;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
