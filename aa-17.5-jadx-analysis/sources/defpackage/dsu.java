package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class dsu {
    static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(null);
    }

    static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }

    public static Bundle[] d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static dum[] e(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        dum[] dumVarArr = new dum[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashSet.add(stringArrayList.get(i2));
                }
            }
            dumVarArr[i] = new dum(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return dumVarArr;
    }

    public static Exception f(String str, Exception exc) {
        int i;
        Object objInvoke;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            objInvoke = method.invoke(null, a.bn(i, "sys.user.", ".ce_available"), "false");
            objInvoke.getClass();
        } catch (Throwable th) {
            adqs.y(exc, th);
        }
        if (!affa.f((String) objInvoke, "true")) {
            if (str != null) {
                File file = new File(str, "siblingTestFile.txt");
                if (file.exists()) {
                    file.delete();
                }
                try {
                    try {
                        file.createNewFile();
                    } catch (IOException unused2) {
                        exc = new egf(exc);
                    }
                    return exc;
                } finally {
                    file.delete();
                }
            }
        }
        return exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(defpackage.afec r4, defpackage.afck r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.ege
            if (r0 == 0) goto L13
            r0 = r5
            ege r0 = (defpackage.ege) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ege r0 = new ege
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 0
            switch(r2) {
                case 0: goto La6;
                case 1: goto L7c;
                case 2: goto L6d;
                case 3: goto L63;
                case 4: goto L3f;
                case 5: goto L34;
                case 6: goto L2e;
                case 7: goto L2a;
                default: goto L22;
            }
        L22:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2a:
            defpackage.woy.dF(r5)
            return r5
        L2e:
            nfh r4 = r0.d
        L30:
            defpackage.woy.dF(r5)     // Catch: java.lang.Throwable -> L3d
            goto L37
        L34:
            nfh r4 = r0.d
            goto L30
        L37:
            java.lang.Object r4 = r4.b
            defpackage.aclh.v(r4)
            return r5
        L3d:
            r5 = move-exception
            goto L53
        L3f:
            nfh r4 = r0.d
            java.lang.String r4 = (java.lang.String) r4
            defpackage.woy.dF(r5)
            r4 = r5
            nfh r4 = (defpackage.nfh) r4
            java.lang.Object r5 = r4.c
            java.lang.Object r5 = r4.a     // Catch: java.lang.Throwable -> L3d
            r0.d = r4     // Catch: java.lang.Throwable -> L3d
            r5 = 6
            r0.b = r5     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L53:
            defpackage.ebj.p(r3, r5)     // Catch: java.lang.Throwable -> L5c
            aezp r5 = new aezp     // Catch: java.lang.Throwable -> L5c
            r5.<init>()     // Catch: java.lang.Throwable -> L5c
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            java.lang.Object r4 = r4.b
            defpackage.aclh.v(r4)
            throw r5
        L63:
            nfh r4 = r0.c
            nfh r0 = r0.d
            afck r0 = (defpackage.afck) r0
        L69:
            defpackage.woy.dF(r5)     // Catch: java.lang.Throwable -> L7a
            goto L74
        L6d:
            nfh r4 = r0.c
            nfh r0 = r0.d
            afco r0 = (defpackage.afco) r0
            goto L69
        L74:
            java.lang.Object r4 = r4.b
            defpackage.aclh.v(r4)
            return r5
        L7a:
            r5 = move-exception
            goto L96
        L7c:
            nfh r4 = r0.c
            java.lang.String r4 = (java.lang.String) r4
            nfh r4 = r0.d
            java.lang.String r4 = (java.lang.String) r4
            defpackage.woy.dF(r5)
            r4 = r5
            nfh r4 = (defpackage.nfh) r4
            java.lang.Object r5 = r4.c
            java.lang.Object r5 = r4.a     // Catch: java.lang.Throwable -> L7a
            r0.d = r3     // Catch: java.lang.Throwable -> L7a
            r0.c = r4     // Catch: java.lang.Throwable -> L7a
            r5 = 3
            r0.b = r5     // Catch: java.lang.Throwable -> L7a
            throw r3     // Catch: java.lang.Throwable -> L7a
        L96:
            defpackage.ebj.p(r3, r5)     // Catch: java.lang.Throwable -> L9f
            aezp r5 = new aezp     // Catch: java.lang.Throwable -> L9f
            r5.<init>()     // Catch: java.lang.Throwable -> L9f
            throw r5     // Catch: java.lang.Throwable -> L9f
        L9f:
            r5 = move-exception
            java.lang.Object r4 = r4.b
            defpackage.aclh.v(r4)
            throw r5
        La6:
            defpackage.woy.dF(r5)
            r5 = 7
            r0.b = r5
            java.lang.Object r4 = r4.invoke(r0)
            if (r4 != r1) goto Lb3
            return r1
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsu.g(afec, afck):java.lang.Object");
    }

    public static /* synthetic */ String h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TEMPORARILY_UNMETERED" : "METERED" : "NOT_ROAMING" : "UNMETERED" : "CONNECTED" : "NOT_REQUIRED";
    }

    public static /* synthetic */ zgp i(afco afcoVar, afeg afegVar) {
        afcoVar.getClass();
        return dsg.w(new fjy(afcoVar, afegVar, 1));
    }
}
