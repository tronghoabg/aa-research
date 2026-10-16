package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dtb {
    static void a(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    static void b(android.app.Notification.BigPictureStyle bigPictureStyle, java.lang.CharSequence charSequence) {
        bigPictureStyle.setContentDescription(null);
    }

    static void c(android.app.Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }

    public static android.app.Person d(defpackage.dur durVar) {
        android.app.Person.Builder name = new android.app.Person.Builder().setName(durVar.a);
        androidx.core.graphics.drawable.IconCompat iconCompat = durVar.b;
        return name.setIcon(iconCompat != null ? defpackage.dtq.b(iconCompat, null) : null).setUri(durVar.c).setKey(durVar.d).setBot(durVar.e).setImportant(durVar.f).build();
    }

    public static defpackage.dur e(android.app.Person person) {
        defpackage.duq duqVar = new defpackage.duq();
        duqVar.a = person.getName();
        duqVar.b = person.getIcon() != null ? defpackage.dtq.d(person.getIcon()) : null;
        duqVar.c = person.getUri();
        duqVar.d = person.getKey();
        duqVar.e = person.isBot();
        duqVar.f = person.isImportant();
        return new defpackage.dur(duqVar);
    }

    public static boolean f(android.view.MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean g(defpackage.eaj eajVar, android.view.KeyEvent keyEvent) {
        if (eajVar == null) {
            return false;
        }
        return eajVar.fQ(keyEvent);
    }

    public static final int[] h(android.net.NetworkRequest networkRequest) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            int[] capabilities = networkRequest.getCapabilities();
            capabilities.getClass();
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            int[] iArr2 = defpackage.foy.a;
            if (networkRequest.hasCapability(i2)) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
        }
        return defpackage.afga.bj(arrayList);
    }

    public static final void i(androidx.work.impl.WorkDatabase workDatabase, int i) {
        workDatabase.t().b(new defpackage.fnu("next_job_scheduler_id", java.lang.Long.valueOf(i)));
    }

    public static final int j(defpackage.fkb fkbVar) {
        fkbVar.getClass();
        int iOrdinal = fkbVar.ordinal();
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
                        throw new defpackage.afas();
                    }
                }
            }
        }
        return i;
    }

    public static final defpackage.fkb k(int i) {
        if (i == 0) {
            return defpackage.fkb.a;
        }
        if (i == 1) {
            return defpackage.fkb.b;
        }
        if (i == 2) {
            return defpackage.fkb.c;
        }
        if (i == 3) {
            return defpackage.fkb.d;
        }
        if (i == 4) {
            return defpackage.fkb.e;
        }
        if (i == 5) {
            return defpackage.fkb.f;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Could not convert ", " to State"));
    }

    public static final defpackage.foz l(byte[] bArr) throws java.io.IOException {
        if (bArr.length == 0) {
            return new defpackage.foz(null);
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
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
                int[] iArr3 = defpackage.foy.a;
                android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr2[i5];
                    try {
                        builder.addCapability(i6);
                    } catch (java.lang.IllegalArgumentException e) {
                        defpackage.fjv.a();
                        android.util.Log.w(defpackage.foz.a, defpackage.a.bm(i6, "Ignoring adding capability '", "'"), e);
                    }
                }
                for (int i7 : defpackage.foy.a) {
                    if (!defpackage.afga.cf(iArr2, i7)) {
                        try {
                            builder.removeCapability(i7);
                        } catch (java.lang.IllegalArgumentException e2) {
                            defpackage.fjv.a();
                            android.util.Log.w(defpackage.foz.a, defpackage.a.bm(i7, "Ignoring removing default capability '", "'"), e2);
                        }
                    }
                }
                for (int i8 = 0; i8 < i; i8++) {
                    builder.addTransportType(iArr[i8]);
                }
                android.net.NetworkRequest networkRequestBuild = builder.build();
                networkRequestBuild.getClass();
                defpackage.foz fozVar = new defpackage.foz(networkRequestBuild);
                defpackage.afga.n(objectInputStream, null);
                defpackage.afga.n(byteArrayInputStream, null);
                return fozVar;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.afga.n(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                defpackage.afga.n(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final java.util.Set m(byte[] bArr) throws java.io.IOException {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            try {
                java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        android.net.Uri uri = android.net.Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new defpackage.fjg(uri, z));
                    }
                    defpackage.afga.n(objectInputStream, null);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.afga.n(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    defpackage.afga.n(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        defpackage.afga.n(byteArrayInputStream, null);
        return linkedHashSet;
    }

    public static final int n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int o(int i) {
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
        if (android.os.Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int p(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final defpackage.fof q(defpackage.fok fokVar) {
        fokVar.getClass();
        return new defpackage.fof(fokVar.a, fokVar.r);
    }
}
