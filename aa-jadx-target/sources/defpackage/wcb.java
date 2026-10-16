package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wcb implements java.lang.Comparable {
    public final long a;
    public final java.lang.String b;
    final int c;
    final long d;
    final java.lang.Object e;
    private final java.lang.RuntimeException f;

    public wcb(long j, java.lang.String str, int i, long j2, java.lang.Object obj) {
        if ((j == 0) != (str != null)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        if (i != 5) {
            this.f = null;
            return;
        }
        if (obj == null) {
            this.f = new java.lang.NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof defpackage.abnv)) {
            this.f = null;
        } else {
            this.f = new java.lang.RuntimeException("Wrong stringOrBytes type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
        }
    }

    public final java.lang.Object a() {
        int i = this.c;
        if (i == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (i == 1) {
            return java.lang.Boolean.TRUE;
        }
        if (i == 2) {
            return java.lang.Long.valueOf(this.d);
        }
        if (i == 3) {
            return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(this.d));
        }
        if (i == 4) {
            java.lang.Object obj = this.e;
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new java.lang.AssertionError("Impossible, this was validated when parsed or created");
        }
        java.lang.Object obj2 = this.e;
        obj2.getClass();
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((defpackage.abnv) obj2).D();
        } catch (java.lang.Throwable th) {
            java.lang.RuntimeException runtimeException = this.f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    public final java.lang.String b() {
        java.lang.String str = this.b;
        return str != null ? str : java.lang.Long.toString(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.wcb wcbVar = (defpackage.wcb) obj;
        long j = wcbVar.a;
        long j2 = this.a;
        int iCompare = java.lang.Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        java.lang.String str = this.b;
        str.getClass();
        java.lang.String str2 = wcbVar.b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wcb)) {
            return false;
        }
        defpackage.wcb wcbVar = (defpackage.wcb) obj;
        return this.a == wcbVar.a && j$.util.Objects.equals(this.b, wcbVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        return b() + ":" + java.lang.String.valueOf(a());
    }
}
