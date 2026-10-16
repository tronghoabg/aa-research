package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kc {
    public int a = 0;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    public boolean f = false;
    public final android.widget.TextView g;
    public final android.content.Context h;

    static {
        new android.graphics.RectF();
        new j$.util.concurrent.ConcurrentHashMap();
    }

    public kc(android.widget.TextView textView) {
        this.g = textView;
        this.h = textView.getContext();
    }

    public static final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            java.util.Arrays.sort(iArr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i : iArr) {
                if (i > 0) {
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
                    if (java.util.Collections.binarySearch(arrayList, numValueOf) < 0) {
                        arrayList.add(numValueOf);
                    }
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean a() {
        return !(this.g instanceof defpackage.je);
    }
}
