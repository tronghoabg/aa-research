package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mow implements java.util.function.BiFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ mow(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        int i = this.a;
        if (i == 0) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.a;
        if (i == 0) {
            return java.lang.Long.valueOf(((java.lang.Long) obj).longValue() + ((java.lang.Long) obj2).longValue());
        }
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? obj : new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            xck xckVar = (xck) obj;
            android.content.Context context = (android.content.Context) obj2;
            defpackage.yqm yqmVar = xck.f;
            context.getClass();
            defpackage.rco rcoVar = xckVar.p;
            xckVar.getClass();
            return defpackage.omv.b(context, rcoVar, new xab(xckVar, 3), null, 0);
        }
        defpackage.yqm yqmVar2 = miw.a;
        java.util.List listI = defpackage.xzd.d("-").i((java.lang.String) obj2);
        if (listI.size() != 3) {
            return j$.util.Optional.empty();
        }
        try {
            int iK = defpackage.mkc.k((java.lang.String) listI.get(0));
            if (iK > 0 && iK <= 9) {
                java.lang.String str = (java.lang.String) listI.get(1);
                int length = str.length();
                if (length == 0) {
                    throw new java.lang.NumberFormatException("empty string");
                }
                if (str.charAt(0) == '+' && length > 1) {
                    i2 = 1;
                }
                long j = 0;
                while (i2 < length) {
                    int iDigit = java.lang.Character.digit(str.charAt(i2), 16);
                    if (iDigit == -1) {
                        throw new java.lang.NumberFormatException(str.toString());
                    }
                    if (j < 0 || j > 1152921504606846975L || (j == 1152921504606846975L && iDigit > 15)) {
                        throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
                    }
                    j = (j * 16) + ((long) iDigit);
                    i2++;
                }
                com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = new com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier(iK, j);
                return defpackage.mkc.k((java.lang.String) listI.get(2)) != radioProgramIdentifier.hashCode() ? j$.util.Optional.empty() : j$.util.Optional.of(radioProgramIdentifier);
            }
            return j$.util.Optional.empty();
        } catch (java.lang.IllegalStateException unused) {
            return j$.util.Optional.empty();
        }
    }
}
