package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class akaj implements Iterator {
    protected String a;
    protected String b;
    protected int c = a(-1);
    protected final akaf d;

    public akaj(akaf akafVar) {
        this.d = akafVar;
    }

    protected static final boolean c(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return !Character.isISOControl(c) && " ,;=()<>@:\\\"/[]?{}\t".indexOf(c) < 0;
    }

    protected static final boolean d(char c) {
        return c == ',';
    }

    protected static final boolean e(char c) {
        return c == '\t' || Character.isSpaceChar(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r9 >= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        r8.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
    
        r0 = r8.a.length();
        r1 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r1 >= r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ff, code lost:
    
        if (c(r8.a.charAt(r1)) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        r8.b = r8.a.substring(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010c, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int a(int r9) throws defpackage.ajpr {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaj.a(int):int");
    }

    public final String b() throws ajpr, NoSuchElementException {
        String str = this.b;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.c = a(this.c);
        return str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() throws ajpr, NoSuchElementException {
        return b();
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
