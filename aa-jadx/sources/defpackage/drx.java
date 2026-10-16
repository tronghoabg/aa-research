package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class drx {
    public int a;
    public java.util.ArrayList b = new java.util.ArrayList();
    int c;
    defpackage.dsf d;

    public drx(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.c = -1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), defpackage.dsj.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.c = typedArrayObtainStyledAttributes.getResourceId(1, this.c);
                java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                context.getResources().getResourceName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    defpackage.dsf dsfVar = new defpackage.dsf();
                    this.d = dsfVar;
                    dsfVar.f(context, this.c);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
