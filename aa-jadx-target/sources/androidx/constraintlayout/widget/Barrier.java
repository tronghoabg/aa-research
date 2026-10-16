package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class Barrier extends defpackage.drt {
    public int a;
    public defpackage.dqs b;

    public Barrier(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.drt
    protected final void a(android.util.AttributeSet attributeSet) {
        super.a(attributeSet);
        this.b = new defpackage.dqs();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.dsj.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.a = typedArrayObtainStyledAttributes.getInt(26, 0);
                } else if (index == 25) {
                    this.b.b = typedArrayObtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.b.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.b;
        k();
    }

    public final void b(int i) {
        this.b.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    @Override // defpackage.drt
    public final void c(defpackage.dqv dqvVar, boolean z) {
        int i = this.a;
        if (z) {
            if (i == 5) {
                i = 1;
            } else if (i == 6) {
                i = 0;
            }
        } else if (i == 5) {
            i = 0;
        } else if (i == 6) {
            i = 1;
        }
        if (dqvVar instanceof defpackage.dqs) {
            ((defpackage.dqs) dqvVar).a = i;
        }
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
