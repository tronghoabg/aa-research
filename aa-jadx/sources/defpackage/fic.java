package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fic {
    final defpackage.aba a;
    final defpackage.aba b;
    final defpackage.aba c;
    public final android.os.Parcel d;
    private final android.util.SparseIntArray e;
    private final int f;
    private final int g;
    private final java.lang.String h;
    private int i;
    private int j;
    private int k;

    public fic(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new defpackage.aba(0), new defpackage.aba(0), new defpackage.aba(0));
    }

    private final java.lang.Class v(java.lang.Class cls) throws java.lang.ClassNotFoundException {
        defpackage.aba abaVar = this.c;
        java.lang.Class cls2 = (java.lang.Class) abaVar.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(java.lang.String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        abaVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final int a(int i, int i2) {
        return !s(i2) ? i : this.d.readInt();
    }

    public final android.os.Parcelable b(android.os.Parcelable parcelable, int i) {
        if (!s(i)) {
            return parcelable;
        }
        return this.d.readParcelable(getClass().getClassLoader());
    }

    public final defpackage.fid c() {
        java.lang.String strN = n();
        if (strN == null) {
            return null;
        }
        defpackage.fic ficVarM = m();
        try {
            defpackage.aba abaVar = this.a;
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) abaVar.get(strN);
            if (declaredMethod == null) {
                declaredMethod = java.lang.Class.forName(strN, false, defpackage.fic.class.getClassLoader()).getDeclaredMethod("read", defpackage.fic.class);
                abaVar.put(strN, declaredMethod);
            }
            return (defpackage.fid) declaredMethod.invoke(null, ficVarM);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException(e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.lang.Throwable cause = e4.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(e4);
        }
    }

    public final java.lang.CharSequence d(java.lang.CharSequence charSequence, int i) {
        if (!s(i)) {
            return charSequence;
        }
        return (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final java.lang.String e(java.lang.String str, int i) {
        return !s(i) ? str : n();
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(java.lang.CharSequence charSequence, int i) {
        p(i);
        android.text.TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(android.os.Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(java.lang.String str, int i) {
        p(i);
        r(str);
    }

    public final void k(defpackage.fid fidVar) {
        if (fidVar == null) {
            r(null);
            return;
        }
        try {
            r(v(fidVar.getClass()).getName());
            defpackage.fic ficVarM = m();
            try {
                java.lang.Class<?> cls = fidVar.getClass();
                defpackage.aba abaVar = this.b;
                java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) abaVar.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = v(cls).getDeclaredMethod("write", cls, defpackage.fic.class);
                    abaVar.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, fidVar, ficVarM);
                ficVarM.o();
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.RuntimeException(e2);
            } catch (java.lang.NoSuchMethodException e3) {
                throw new java.lang.RuntimeException(e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                java.lang.Throwable cause = e4.getCause();
                if (cause instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) cause);
                }
                if (!(cause instanceof java.lang.Error)) {
                    throw new java.lang.RuntimeException(e4);
                }
                throw ((java.lang.Error) cause);
            }
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.RuntimeException(java.lang.String.valueOf(fidVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    public final boolean l(boolean z, int i) {
        if (s(i)) {
            return this.d.readInt() != 0;
        }
        return z;
    }

    protected final defpackage.fic m() {
        android.os.Parcel parcel = this.d;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        java.lang.String str = this.h;
        return new defpackage.fic(parcel, iDataPosition, i, str.concat("  "), this.a, this.b, this.c);
    }

    public final java.lang.String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            android.util.SparseIntArray sparseIntArray = this.e;
            android.os.Parcel parcel = this.d;
            int i2 = sparseIntArray.get(i);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(java.lang.String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.g;
            int i4 = this.k;
            if (i2 >= i3) {
                return i4 == i;
            }
            if (i4 == i) {
                return true;
            }
            if (java.lang.String.valueOf(i4).compareTo(java.lang.String.valueOf(i)) > 0) {
                return false;
            }
            android.os.Parcel parcel = this.d;
            parcel.setDataPosition(this.j);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i5;
        }
    }

    public final defpackage.fid t(defpackage.fid fidVar) {
        return !s(1) ? fidVar : c();
    }

    public final void u(defpackage.fid fidVar) {
        p(1);
        k(fidVar);
    }

    private fic(android.os.Parcel parcel, int i, int i2, java.lang.String str, defpackage.aba abaVar, defpackage.aba abaVar2, defpackage.aba abaVar3) {
        this.a = abaVar;
        this.b = abaVar2;
        this.c = abaVar3;
        this.e = new android.util.SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
