package defpackage;

import android.app.RemoteInput;
import android.graphics.Shader;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dtb {
    public static int a(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static Shader.TileMode b(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final Object c(efa efaVar, afeg afegVar, afck afckVar) {
        return efaVar.a(new eic(afegVar, null), afckVar);
    }

    public static final void d(WorkDatabase workDatabase, int i) {
        workDatabase.t().b(new fnn("next_job_scheduler_id", Long.valueOf(i)));
    }

    public static final int e(fju fjuVar) {
        fjuVar.getClass();
        int iOrdinal = fjuVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new aezs();
                    }
                }
            }
        }
        return i;
    }

    public static final fju f(int i) {
        if (i == 0) {
            return fju.a;
        }
        if (i == 1) {
            return fju.b;
        }
        if (i == 2) {
            return fju.c;
        }
        if (i == 3) {
            return fju.d;
        }
        if (i == 4) {
            return fju.e;
        }
        if (i == 5) {
            return fju.f;
        }
        throw new IllegalArgumentException(a.bn(i, "Could not convert ", " to State"));
    }

    public static final Cfor g(byte[] bArr) throws IOException {
        if (bArr.length == 0) {
            return new Cfor(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr2[i5];
                    try {
                        builder.addCapability(i6);
                    } catch (IllegalArgumentException e) {
                        fjo.a();
                        Log.w(Cfor.a, a.bn(i6, "Ignoring adding capability '", "'"), e);
                    }
                }
                int[] iArr3 = fos.a;
                for (int i7 = 0; i7 < 3; i7++) {
                    int i8 = iArr3[i7];
                    if (!woy.dl(iArr2, i8)) {
                        try {
                            builder.removeCapability(i8);
                        } catch (IllegalArgumentException e2) {
                            fjo.a();
                            Log.w(Cfor.a, a.bn(i8, "Ignoring removing default capability '", "'"), e2);
                        }
                    }
                }
                for (int i9 = 0; i9 < i; i9++) {
                    builder.addTransportType(iArr[i9]);
                }
                NetworkRequest networkRequestBuild = builder.build();
                networkRequestBuild.getClass();
                Cfor cfor = new Cfor(networkRequestBuild);
                affa.n(objectInputStream, null);
                affa.n(byteArrayInputStream, null);
                return cfor;
            } finally {
            }
        } finally {
        }
    }

    public static final Set h(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new fiz(uri, z));
                    }
                    affa.n(objectInputStream, null);
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        affa.n(byteArrayInputStream, null);
        return linkedHashSet;
    }

    public static final int i(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.bn(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(a.bn(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int k(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.bn(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final fny l(fod fodVar) {
        fodVar.getClass();
        return new fny(fodVar.a, fodVar.r);
    }

    public static final List m(fnk fnkVar, String str) {
        fnkVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listCh = woy.ch(fnkVar.a(str));
        while (!listCh.isEmpty()) {
            String str2 = (String) woy.bu(listCh);
            linkedHashSet.add(str2);
            listCh.addAll(fnkVar.a(str2));
        }
        return woy.cf(linkedHashSet);
    }
}
