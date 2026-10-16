package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wvu {
    public int a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public wvu(android.content.Context context, int i) {
        int next;
        int depth;
        e();
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
            try {
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            android.content.res.Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    android.content.res.TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, defpackage.wve.a) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, defpackage.wve.a, 0, 0);
                                    defpackage.wvi wviVar = new defpackage.wvi(defpackage.wvi.k(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)));
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != com.google.android.projection.gearhead.R.attr.shapeAppearance && attributeNameResource != com.google.android.projection.gearhead.R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] iArrTrimStateSet = android.util.StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || iArrTrimStateSet.length == 0) {
                                        this.b = wviVar;
                                    }
                                    java.lang.Object obj = this.c;
                                    if (i5 >= ((int[][]) obj).length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr2 = new int[i6][];
                                        java.lang.System.arraycopy(obj, 0, iArr2, 0, i5);
                                        this.c = iArr2;
                                        defpackage.wvi[] wviVarArr = new defpackage.wvi[i6];
                                        java.lang.System.arraycopy(this.d, 0, wviVarArr, 0, i5);
                                        this.d = wviVarArr;
                                    }
                                    java.lang.Object obj2 = this.c;
                                    int i7 = this.a;
                                    ((int[][]) obj2)[i7] = iArrTrimStateSet;
                                    ((defpackage.wvi[]) this.d)[i7] = wviVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            } catch (java.lang.Throwable th) {
                if (xml == null) {
                    throw th;
                }
                try {
                    xml.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (android.content.res.Resources.NotFoundException | java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            e();
        }
    }

    private final void e() {
        this.b = new defpackage.wvi();
        this.c = new int[10][];
        this.d = new defpackage.wvi[10];
    }

    public final defpackage.wvv a() {
        if (this.a == 0) {
            return null;
        }
        return new defpackage.wvv(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ueu] */
    public final defpackage.uel b() {
        java.lang.Object obj;
        int i;
        ?? r0 = this.d;
        if (r0 == 0 || (obj = this.b) == null || (i = this.a) == 0) {
            throw new java.lang.IllegalStateException();
        }
        return new defpackage.uel(r0, (defpackage.uei) obj, i, (defpackage.xyn) this.c);
    }

    public final void c(int i) {
        this.b = defpackage.uei.UNPLACED;
        this.a = i;
        this.c = defpackage.xxe.a;
    }

    public final void d(defpackage.ueu ueuVar) {
        ueuVar.getClass();
        this.d = ueuVar;
    }

    public wvu(defpackage.uel uelVar) {
        this.c = defpackage.xxe.a;
        this.d = uelVar.a;
        this.b = uelVar.b;
        this.a = uelVar.d;
        this.c = uelVar.c;
    }

    public wvu() {
        this.c = defpackage.xxe.a;
    }

    public wvu(defpackage.wvv wvvVar) {
        int i = wvvVar.a;
        this.a = i;
        this.b = wvvVar.b;
        this.c = new int[wvvVar.c.length][];
        this.d = new defpackage.wvi[wvvVar.d.length];
        java.lang.System.arraycopy(wvvVar.c, 0, this.c, 0, i);
        java.lang.System.arraycopy(wvvVar.d, 0, this.d, 0, this.a);
    }
}
