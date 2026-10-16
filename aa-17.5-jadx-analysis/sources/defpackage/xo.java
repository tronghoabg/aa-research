package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class xo implements AutoCloseable {
    public final ArrayDeque a;
    private String[] b;

    private xo(Object obj, String str, ArrayDeque arrayDeque) {
        this.a = arrayDeque;
        if (obj != null) {
            xn xnVar = new xn(obj, str);
            arrayDeque.addFirst(xnVar);
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int size = arrayDeque.size();
                int i = 11;
                int iMin = Math.min(size, 11);
                String[] strArr = this.b;
                if (strArr == null) {
                    strArr = new String[12];
                    this.b = strArr;
                }
                String strConcat = strArr[iMin];
                if (strConcat == null) {
                    char[] cArr = new char[iMin];
                    Arrays.fill(cArr, ' ');
                    String str2 = new String(cArr);
                    if (iMin == 11) {
                        strConcat = str2.concat("...");
                    } else {
                        i = iMin;
                        strConcat = str2;
                    }
                    this.b[i] = strConcat;
                }
                Log.v("CarApp.Bun", strConcat.concat(xq.e(xnVar.a.getClass()) + " " + xnVar.b));
            }
        }
    }

    public static xo a() {
        return new xo(null, "", new ArrayDeque());
    }

    static xo b(Object obj, String str, xo xoVar) {
        return new xo(obj, str, xoVar.a);
    }

    final String c() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = this.a;
        int iMin = Math.min(arrayDeque.size(), 8);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((xn) itDescendingIterator.next()).a());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.removeFirst();
    }
}
