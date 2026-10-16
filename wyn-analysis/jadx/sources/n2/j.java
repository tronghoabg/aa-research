package N2;

import A.AbstractC0213f;
import J5.m;
import J5.y;
import Q1.u;
import T5.B;
import T5.x;
import T5.z;
import X0.AbstractC1278f;
import X0.C1283k;
import X0.C1289q;
import X0.E;
import X0.F;
import X0.G;
import X0.H;
import X0.I;
import X0.Q;
import X0.T;
import X0.v;
import Y2.w;
import ad.C1355I;
import ad.L;
import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Window;
import androidx.core.graphics.drawable.IconCompat;
import ba.C1521a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.wynauto.wyn.R;
import io.flutter.plugin.platform.n;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k1.w0;
import k1.x0;
import k1.y0;
import k3.C3171c;
import k3.C3184p;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3644a;
import s2.o;
import u6.AbstractC4256a;
import u6.C4261f;
import u6.t;
import x.C4413f;

/* loaded from: classes.dex */
public final class j implements x, w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8378a;

    /* renamed from: b, reason: collision with root package name */
    public int f8379b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8380c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8381d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8382e;

    public /* synthetic */ j(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i5) {
        this.f8380c = obj;
        this.f8381d = obj2;
        this.f8378a = bArr;
        this.f8382e = objArr;
        this.f8379b = i5;
    }

    public static void f(int i5, int i10, String str) throws C4261f {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC4256a.g(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i5, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC4256a.f();
    }

    public static void g(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            boolean z10 = AbstractC3340k.g(str.charAt(!z2 ? i5 : length), 32) <= 0;
            if (z2) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i5++;
            } else {
                z2 = true;
            }
        }
        if (str.subSequence(i5, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e7) {
            Log.w("SupportSQLite", "delete failed: ", e7);
        }
    }

    public static void n(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public void a(C1283k c1283k) {
        IconCompat iconCompatA = c1283k.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.j(null) : null, c1283k.f15857i, c1283k.f15858j);
        T[] tArr = c1283k.f15851c;
        if (tArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[tArr.length];
            for (int i5 = 0; i5 < tArr.length; i5++) {
                T t10 = tArr[i5];
                t10.getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder("FlutterLocalNotificationsPluginInputResult").setLabel(t10.f15820a).setChoices(t10.f15821b).setAllowFreeFormInput(t10.f15822c).addExtras(t10.f15823d);
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator it = t10.f15824e.iterator();
                    while (it.hasNext()) {
                        G.d(builderAddExtras, (String) it.next());
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC1278f.e(builderAddExtras);
                }
                remoteInputArr[i5] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = c1283k.f15849a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z2 = c1283k.f15852d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            F.b(builder, z2);
        }
        int i11 = c1283k.f15854f;
        bundle2.putInt("android.support.action.semanticAction", i11);
        if (i10 >= 28) {
            H.c(builder, i11);
        }
        if (i10 >= 29) {
            AbstractC1278f.d(builder, c1283k.f15855g);
        }
        if (i10 >= 31) {
            I.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", c1283k.f15853e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.f8381d).addAction(builder.build());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    @Override // T5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(Y4.b r29) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.j.c(Y4.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    @Override // Y2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(Q1.o r36) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.j.e(Q1.o):void");
    }

    public int h(String str) throws C4261f {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f8379b, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        AbstractC4256a.f();
        return iGlGetAttribLocation;
    }

    public void j(InterfaceC3644a interfaceC3644a) throws IOException {
        Cursor cursorK = interfaceC3644a.K("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (cursorK.moveToFirst()) {
                if (cursorK.getInt(0) == 0) {
                    z2 = true;
                }
            }
            cursorK.close();
            H5.a aVar = (H5.a) this.f8381d;
            aVar.c(interfaceC3644a);
            if (!z2) {
                C3184p c3184pM = aVar.m(interfaceC3644a);
                if (!c3184pM.f39244b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c3184pM.f39243a);
                }
            }
            p(interfaceC3644a);
            aVar.i(interfaceC3644a);
        } finally {
        }
    }

    public void k(InterfaceC3644a interfaceC3644a, int i5, int i10) {
        m(interfaceC3644a, i5, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(o3.InterfaceC3644a r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.K(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto L8f
        L18:
            r1 = r2
        L19:
            r0.close()
            java.lang.Object r0 = r5.f8381d
            H5.a r0 = (H5.a) r0
            r3 = 0
            if (r1 == 0) goto L68
            Ne.a r1 = new Ne.a
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.t(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L3b
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r6 = move-exception
            goto L62
        L3b:
            r2 = r3
        L3c:
            r1.close()
            java.lang.Object r1 = r5.f8378a
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L73
            java.lang.Object r4 = r5.f8382e
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L54
            goto L73
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r3 = ", found: "
            java.lang.String r0 = N0.a.h(r0, r1, r3, r2)
            r6.<init>(r0)
            throw r6
        L62:
            throw r6     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            Ba.c.n(r1, r6)
            throw r0
        L68:
            k3.p r1 = r0.m(r6)
            boolean r2 = r1.f39244b
            if (r2 == 0) goto L79
            r5.p(r6)
        L73:
            r0.j(r6)
            r5.f8380c = r3
            return
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f39243a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r1 = move-exception
            Ba.c.n(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.j.l(o3.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0083 A[EDGE_INSN: B:73:0x0083->B:37:0x0083 BREAK  A[LOOP:1: B:12:0x0022->B:76:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(o3.InterfaceC3644a r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.j.m(o3.a, int, int):void");
    }

    public void o(L8.a aVar) {
        Window window = ((Activity) this.f8380c).getWindow();
        L l10 = new L(window.getDecorView());
        int i5 = Build.VERSION.SDK_INT;
        com.moloco.sdk.internal.publisher.H y0Var = i5 >= 35 ? new y0(window, l10, 1) : i5 >= 30 ? new w0(window, l10, 1) : i5 >= 26 ? new x0(window, l10, 0) : new w0(window, l10, 0);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i11 = aVar.f6984b;
        if (i11 != 0) {
            int iF = AbstractC0213f.f(i11);
            if (iF == 0) {
                y0Var.r0(false);
            } else if (iF == 1) {
                y0Var.r0(true);
            }
        }
        Integer num = (Integer) aVar.f6983a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) aVar.f6986d;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            int i12 = aVar.f6985c;
            if (i12 != 0) {
                int iF2 = AbstractC0213f.f(i12);
                if (iF2 == 0) {
                    y0Var.q0(false);
                } else if (iF2 == 1) {
                    y0Var.q0(true);
                }
            }
            Integer num2 = (Integer) aVar.f6987e;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) aVar.f6988f;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) aVar.f6989g;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f8382e = aVar;
    }

    public void p(InterfaceC3644a interfaceC3644a) {
        interfaceC3644a.f("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        interfaceC3644a.f("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f8378a) + "')");
    }

    public void q() {
        ((Activity) this.f8380c).getWindow().getDecorView().setSystemUiVisibility(this.f8379b);
        L8.a aVar = (L8.a) this.f8382e;
        if (aVar != null) {
            o(aVar);
        }
    }

    public j(C3171c c3171c, H5.a aVar, String str, String str2) {
        this.f8379b = aVar.f4893b;
        this.f8380c = c3171c;
        this.f8381d = aVar;
        this.f8378a = str;
        this.f8382e = str2;
    }

    public j(C1289q c1289q) {
        ArrayList arrayList;
        Bundle bundle;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Bundle[] bundleArr;
        ArrayList arrayList4;
        C1283k c1283kJ;
        C1283k c1283kJ2;
        int i5;
        new ArrayList();
        this.f8382e = new Bundle();
        this.f8378a = c1289q;
        Context context = c1289q.f15874a;
        this.f8380c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8381d = G.a(context, c1289q.f15866B);
        } else {
            this.f8381d = new Notification.Builder(c1289q.f15874a);
        }
        Notification notification = c1289q.f15871G;
        ((Notification.Builder) this.f8381d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c1289q.f15878e).setContentText(c1289q.f15879f).setContentInfo(null).setContentIntent(c1289q.f15880g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c1289q.f15881h, (notification.flags & 128) != 0).setNumber(c1289q.f15883j).setProgress(c1289q.f15888p, c1289q.f15889q, c1289q.f15890r);
        Notification.Builder builder = (Notification.Builder) this.f8381d;
        IconCompat iconCompat = c1289q.f15882i;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.j(context));
        ((Notification.Builder) this.f8381d).setSubText(c1289q.f15887o).setUsesChronometer(c1289q.f15885m).setPriority(c1289q.k);
        E e7 = c1289q.f15886n;
        if (e7 instanceof v) {
            v vVar = (v) e7;
            PendingIntent pendingIntent = vVar.f15902h;
            if (pendingIntent == null) {
                c1283kJ = vVar.j(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, vVar.f15905l, R.color.call_notification_decline_color, vVar.f15903i);
            } else {
                c1283kJ = vVar.j(R.drawable.ic_call_decline, R.string.call_notification_decline_action, vVar.f15905l, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = vVar.f15901g;
            if (pendingIntent2 == null) {
                c1283kJ2 = null;
            } else {
                boolean z2 = vVar.f15904j;
                c1283kJ2 = vVar.j(z2 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z2 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, vVar.k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(c1283kJ);
            ArrayList arrayList6 = ((C1289q) vVar.f15788b).f15875b;
            if (arrayList6 != null) {
                Iterator it = arrayList6.iterator();
                i5 = 2;
                while (it.hasNext()) {
                    C1283k c1283k = (C1283k) it.next();
                    if (c1283k.f15855g) {
                        arrayList5.add(c1283k);
                    } else if (!c1283k.f15849a.getBoolean("key_action_priority") && i5 > 1) {
                        arrayList5.add(c1283k);
                        i5--;
                    }
                    if (c1283kJ2 != null && i5 == 1) {
                        arrayList5.add(c1283kJ2);
                        i5--;
                    }
                }
            } else {
                i5 = 2;
            }
            if (c1283kJ2 != null && i5 >= 1) {
                arrayList5.add(c1283kJ2);
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                a((C1283k) it2.next());
            }
        } else {
            Iterator it3 = c1289q.f15875b.iterator();
            while (it3.hasNext()) {
                a((C1283k) it3.next());
            }
        }
        Bundle bundle2 = c1289q.f15897y;
        if (bundle2 != null) {
            ((Bundle) this.f8382e).putAll(bundle2);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f8381d).setShowWhen(c1289q.f15884l);
        ((Notification.Builder) this.f8381d).setLocalOnly(c1289q.f15893u);
        ((Notification.Builder) this.f8381d).setGroup(c1289q.f15891s);
        ((Notification.Builder) this.f8381d).setSortKey(null);
        ((Notification.Builder) this.f8381d).setGroupSummary(c1289q.f15892t);
        this.f8379b = c1289q.f15869E;
        ((Notification.Builder) this.f8381d).setCategory(c1289q.f15896x);
        ((Notification.Builder) this.f8381d).setColor(c1289q.f15898z);
        ((Notification.Builder) this.f8381d).setVisibility(c1289q.f15865A);
        ((Notification.Builder) this.f8381d).setPublicVersion(null);
        ((Notification.Builder) this.f8381d).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList7 = c1289q.f15873I;
        ArrayList arrayList8 = c1289q.f15876c;
        if (i10 < 28) {
            if (arrayList8 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList8.size());
                Iterator it4 = arrayList8.iterator();
                while (it4.hasNext()) {
                    Q q4 = (Q) it4.next();
                    String str = q4.f15815c;
                    if (str == null) {
                        CharSequence charSequence = q4.f15813a;
                        if (charSequence != null) {
                            str = "name:" + ((Object) charSequence);
                        } else {
                            str = "";
                        }
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList4;
                } else {
                    C4413f c4413f = new C4413f(arrayList7.size() + arrayList4.size());
                    c4413f.addAll(arrayList4);
                    c4413f.addAll(arrayList7);
                    arrayList7 = new ArrayList(c4413f);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                ((Notification.Builder) this.f8381d).addPerson((String) it5.next());
            }
        }
        ArrayList arrayList9 = c1289q.f15877d;
        if (arrayList9.size() > 0) {
            if (c1289q.f15897y == null) {
                c1289q.f15897y = new Bundle();
            }
            Bundle bundle3 = c1289q.f15897y.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i11 = 0;
            while (i11 < arrayList9.size()) {
                String string = Integer.toString(i11);
                C1283k c1283k2 = (C1283k) arrayList9.get(i11);
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatA = c1283k2.a();
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.h() : 0);
                bundle6.putCharSequence("title", c1283k2.f15857i);
                bundle6.putParcelable("actionIntent", c1283k2.f15858j);
                Bundle bundle7 = c1283k2.f15849a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c1283k2.f15852d);
                bundle6.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle);
                T[] tArr = c1283k2.f15851c;
                if (tArr == null) {
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[tArr.length];
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    int i12 = 0;
                    while (i12 < tArr.length) {
                        T t10 = tArr[i12];
                        int i13 = i12;
                        Bundle bundle8 = new Bundle();
                        t10.getClass();
                        T[] tArr2 = tArr;
                        Bundle[] bundleArr3 = bundleArr2;
                        bundle8.putString("resultKey", "FlutterLocalNotificationsPluginInputResult");
                        bundle8.putCharSequence("label", t10.f15820a);
                        bundle8.putCharSequenceArray("choices", t10.f15821b);
                        bundle8.putBoolean("allowFreeFormInput", t10.f15822c);
                        bundle8.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, t10.f15823d);
                        HashSet hashSet = t10.f15824e;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(hashSet.size());
                            Iterator it6 = hashSet.iterator();
                            while (it6.hasNext()) {
                                arrayList10.add((String) it6.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr3[i13] = bundle8;
                        i12 = i13 + 1;
                        tArr = tArr2;
                        bundleArr2 = bundleArr3;
                    }
                    bundleArr = bundleArr2;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c1283k2.f15853e);
                bundle6.putInt("semanticAction", c1283k2.f15854f);
                bundle5.putBundle(string, bundle6);
                i11++;
                arrayList9 = arrayList2;
                arrayList8 = arrayList3;
            }
            arrayList = arrayList8;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (c1289q.f15897y == null) {
                c1289q.f15897y = new Bundle();
            }
            c1289q.f15897y.putBundle("android.car.EXTENSIONS", bundle3);
            ((Bundle) this.f8382e).putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList8;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 24) {
            ((Notification.Builder) this.f8381d).setExtras(c1289q.f15897y);
            F.c((Notification.Builder) this.f8381d);
        }
        if (i14 >= 26) {
            G.e((Notification.Builder) this.f8381d);
            G.h((Notification.Builder) this.f8381d);
            G.i((Notification.Builder) this.f8381d, c1289q.f15867C);
            G.j((Notification.Builder) this.f8381d, c1289q.f15868D);
            G.g((Notification.Builder) this.f8381d, c1289q.f15869E);
            if (c1289q.f15895w) {
                G.f((Notification.Builder) this.f8381d, c1289q.f15894v);
            }
            if (!TextUtils.isEmpty(c1289q.f15866B)) {
                ((Notification.Builder) this.f8381d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                Q q10 = (Q) it7.next();
                Notification.Builder builder2 = (Notification.Builder) this.f8381d;
                q10.getClass();
                H.a(builder2, H.d(q10));
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            AbstractC1278f.b((Notification.Builder) this.f8381d, c1289q.f15870F);
            AbstractC1278f.c((Notification.Builder) this.f8381d);
        }
        if (c1289q.f15872H) {
            if (((C1289q) this.f8378a).f15892t) {
                this.f8379b = 2;
            } else {
                this.f8379b = 1;
            }
            ((Notification.Builder) this.f8381d).setVibrate(null);
            ((Notification.Builder) this.f8381d).setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            ((Notification.Builder) this.f8381d).setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(((C1289q) this.f8378a).f15891s)) {
                    ((Notification.Builder) this.f8381d).setGroup("silent");
                }
                G.g((Notification.Builder) this.f8381d, this.f8379b);
            }
        }
    }

    public void i(InterfaceC3644a interfaceC3644a) {
    }

    @Override // Y2.w
    public void b(u uVar, o oVar, B b5) {
    }

    @Override // T5.x
    public void d(t tVar, m mVar, B b5) {
    }

    public j(String str, String str2) throws C4261f {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f8379b = iGlCreateProgram;
        AbstractC4256a.f();
        f(iGlCreateProgram, 35633, str);
        f(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        AbstractC4256a.g("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f8378a = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f8380c = new C1355I[iArr2[0]];
        for (int i5 = 0; i5 < iArr2[0]; i5++) {
            int i10 = this.f8379b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr3, 0);
            int i11 = iArr3[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveAttrib(i10, i5, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                if (bArr[i12] == 0) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            String str3 = new String(bArr, 0, i11);
            GLES20.glGetAttribLocation(i10, str3);
            C1355I c1355i = new C1355I(14);
            ((C1355I[]) this.f8380c)[i5] = c1355i;
            ((HashMap) this.f8378a).put(str3, c1355i);
        }
        this.f8382e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f8379b, 35718, iArr4, 0);
        this.f8381d = new ae.b[iArr4[0]];
        for (int i13 = 0; i13 < iArr4[0]; i13++) {
            int i14 = this.f8379b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i14, 35719, iArr5, 0);
            int i15 = iArr5[0];
            byte[] bArr2 = new byte[i15];
            GLES20.glGetActiveUniform(i14, i13, i15, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i16 = 0;
            while (true) {
                if (i16 >= i15) {
                    break;
                }
                if (bArr2[i16] == 0) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            String str4 = new String(bArr2, 0, i15);
            GLES20.glGetUniformLocation(i14, str4);
            ae.b bVar = new ae.b();
            ((ae.b[]) this.f8381d)[i13] = bVar;
            ((HashMap) this.f8382e).put(str4, bVar);
        }
        AbstractC4256a.f();
    }

    public j(Activity activity, C1521a c1521a, kc.e eVar) {
        n nVar = new n(this, 1);
        this.f8380c = activity;
        this.f8381d = c1521a;
        c1521a.f19415c = nVar;
        this.f8378a = eVar;
        this.f8379b = 1280;
    }

    public j(z zVar, int i5) {
        this.f8382e = zVar;
        this.f8380c = new y(new byte[5], 5, 6, (byte) 0);
        this.f8381d = new SparseArray();
        this.f8378a = new SparseIntArray();
        this.f8379b = i5;
    }

    public j(Y2.y yVar, int i5) {
        this.f8382e = yVar;
        this.f8380c = new y(new byte[5], 5, 1, (byte) 0);
        this.f8381d = new SparseArray();
        this.f8378a = new SparseIntArray();
        this.f8379b = i5;
    }
}
