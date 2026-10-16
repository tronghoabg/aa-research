package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lnh extends android.os.Handler {
    public int a = 0;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public long e;
    public android.graphics.Bitmap f;
    public final defpackage.kfw g;
    public lng h;
    final /* synthetic */ defpackage.lni i;
    public kfv j;
    private defpackage.lmk k;
    private android.net.Uri l;

    protected lnh(defpackage.lni lniVar) {
        this.i = lniVar;
        android.content.Context context = lniVar.b;
        if (defpackage.kfw.b == null) {
            synchronized (defpackage.kfw.c) {
                if (defpackage.kfw.b == null) {
                    defpackage.kfw.b = new defpackage.kfw(context);
                }
            }
        }
        this.g = defpackage.kfw.b;
    }

    private final void a(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            this.f = null;
        } else if (bitmap.getWidth() > 256 || bitmap.getHeight() > 256) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.lni.a.h()).ai((char) 4028)).u("Image exceeded 256x256, omitting it from car metadata update");
            this.f = null;
        } else {
            this.f = bitmap;
        }
        lng lngVar = this.h;
        if (lngVar != null) {
            lngVar.cancel(true);
        }
        lng lngVar2 = new lng(this, this.a);
        this.h = lngVar2;
        lngVar2.execute(new android.graphics.Bitmap[]{this.f});
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int[] iArr;
        defpackage.adnr adnrVar;
        int i = message.what;
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((defpackage.yqj) defpackage.lni.a.l().ai((char) 4027)).u("Received a new album art...");
                a((android.graphics.Bitmap) message.obj);
                return;
            }
            ((defpackage.yqj) defpackage.lni.a.l().ai((char) 4026)).u("Image downloaded...");
            if (message.arg1 == this.a) {
                a((android.graphics.Bitmap) message.obj);
                return;
            }
            return;
        }
        this.a++;
        if (message.obj == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.lni.a.h()).ai((char) 4025)).u("media metadata is null!");
            return;
        }
        defpackage.lmk lmkVar = (defpackage.lmk) message.obj;
        java.lang.Object obj = null;
        if (lmkVar != this.k) {
            this.k = lmkVar;
            lmj lmjVarH = lmkVar.h();
            this.b = lmjVarH.S() == null ? null : lmjVarH.S().toString();
            this.c = lmjVarH.R() == null ? null : lmjVarH.R().toString();
            this.d = lmjVarH.Q() == null ? null : lmjVarH.Q().toString();
            this.e = lmkVar.O("android.media.metadata.DURATION");
            android.graphics.Bitmap bitmapO = lmjVarH.O();
            if (bitmapO != null) {
                this.f = android.graphics.Bitmap.createScaledBitmap(bitmapO, 256, 256, false);
            } else {
                this.f = null;
            }
            this.l = lmjVarH.P();
        }
        kfv kfvVar = this.j;
        if (kfvVar != null) {
            this.g.a(kfvVar);
            this.j = null;
        }
        android.graphics.Bitmap bitmap = this.f;
        if (bitmap != null) {
            a(bitmap);
        } else {
            android.net.Uri uri = this.l;
            defpackage.lni lniVar = this.i;
            if (uri != null) {
                this.j = new kfv(lniVar, this.a);
                defpackage.kfw kfwVar = this.g;
                kfy kfyVar = new kfy(lniVar.b);
                kfyVar.a = uri;
                kfyVar.c(256);
                kfyVar.b(256);
                kfz kfzVarA = kfyVar.a();
                kfv kfvVar2 = this.j;
                kfwVar.a(kfvVar2);
                if (kfzVarA.d == 2048) {
                    int[] iArr2 = defpackage.kfw.d;
                    int length = iArr2.length;
                    while (i2 >= 0) {
                        defpackage.adnr adnrVar2 = (defpackage.adnr) kfwVar.e.get(defpackage.kfw.b(kfzVarA.a(), iArr2[i2]));
                        if (adnrVar2 != null && !adnrVar2.a) {
                            obj = adnrVar2.b;
                            break;
                        }
                        i2--;
                    }
                } else {
                    java.lang.String strB = defpackage.kfw.b(kfzVarA.a(), kfzVarA.d);
                    android.util.LruCache lruCache = kfwVar.e;
                    defpackage.adnr adnrVar3 = (defpackage.adnr) lruCache.get(strB);
                    if (adnrVar3 != null) {
                        boolean z = adnrVar3.a;
                        java.lang.Object obj2 = adnrVar3.b;
                        if (z && ((android.graphics.Bitmap) obj2).getHeight() < kfzVarA.d) {
                            iArr = defpackage.kfw.d;
                            int length2 = iArr.length;
                            while (i2 >= 0) {
                                if (iArr[i2] < kfzVarA.d && (adnrVar = (defpackage.adnr) lruCache.get(defpackage.kfw.b(kfzVarA.a(), iArr[i2]))) != null && !adnrVar.a) {
                                    obj = adnrVar.b;
                                    break;
                                }
                                i2--;
                            }
                        } else {
                            obj = obj2;
                        }
                    } else {
                        iArr = defpackage.kfw.d;
                        int length3 = iArr.length;
                        while (i2 >= 0) {
                            if (iArr[i2] < kfzVarA.d) {
                                obj = adnrVar.b;
                                break;
                            }
                            i2--;
                        }
                    }
                }
                kfu kfuVar = new kfu(kfwVar, (android.graphics.Bitmap) obj, kfvVar2);
                kfvVar2.a = new java.lang.ref.SoftReference(kfuVar);
                kfuVar.executeOnExecutor(defpackage.kfw.a, new kfz[]{kfzVarA});
            } else {
                lniVar.p(this.b, this.c, this.d, null, this.e);
            }
        }
        this.i.i = lmkVar;
    }
}
