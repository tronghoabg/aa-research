package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public class aidz implements aiei {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final aiei NO_LOCKS;
    private static final String PACKAGE_NAME;
    private final String debugText;
    private final aidp exceptionHandlingStrategy;
    protected final aief lock;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidz.$$$reportNull$$$0(int):void");
    }

    static {
        String strSubstring;
        String canonicalName = aidz.class.getCanonicalName();
        canonicalName.getClass();
        int iF = afyh.F(canonicalName, ".", 0, 6);
        if (iF == -1) {
            strSubstring = "";
        } else {
            strSubstring = canonicalName.substring(0, iF);
            strSubstring.getClass();
        }
        PACKAGE_NAME = strSubstring;
        NO_LOCKS = new aidi("NO_LOCKS", aidp.THROW, aidh.INSTANCE);
    }

    private aidz(String str, aidp aidpVar, aief aiefVar) {
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        if (aidpVar == null) {
            $$$reportNull$$$0(5);
        }
        if (aiefVar == null) {
            $$$reportNull$$$0(6);
        }
        this.lock = aiefVar;
        this.exceptionHandlingStrategy = aidpVar;
        this.debugText = str;
    }

    static /* synthetic */ Throwable access$200(Throwable th) {
        sanitizeStackTrace(th);
        return th;
    }

    private static <K> ConcurrentMap<K, Object> createConcurrentHashMap() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t) {
        if (t == null) {
            $$$reportNull$$$0(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!stackTrace[i].getClassName().startsWith(PACKAGE_NAME)) {
                break;
            }
            i++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        if (t == null) {
            $$$reportNull$$$0(37);
        }
        return t;
    }

    @Override // defpackage.aiei
    public <T> T compute(afdr<? extends T> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(34);
        }
        this.lock.lock();
        try {
            return afdrVar.invoke();
        } finally {
        }
    }

    @Override // defpackage.aiei
    public <K, V> aidd<K, V> createCacheWithNotNullValues() {
        return new aidl(this, createConcurrentHashMap(), null);
    }

    @Override // defpackage.aiei
    public <K, V> aide<K, V> createCacheWithNullableValues() {
        return new aidn(this, createConcurrentHashMap(), null);
    }

    @Override // defpackage.aiei
    public <T> aiec<T> createLazyValue(afdr<? extends T> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(23);
        }
        return new aidt(this, afdrVar);
    }

    @Override // defpackage.aiei
    public <T> aiec<T> createLazyValueWithPostCompute(afdr<? extends T> afdrVar, afec<? super Boolean, ? extends T> afecVar, afec<? super T, afak> afecVar2) {
        if (afdrVar == null) {
            $$$reportNull$$$0(28);
        }
        if (afecVar2 == null) {
            $$$reportNull$$$0(29);
        }
        return new aidk(this, this, afdrVar, afecVar, afecVar2);
    }

    @Override // defpackage.aiei
    public <K, V> aiea<K, V> createMemoizedFunction(afec<? super K, ? extends V> afecVar) {
        if (afecVar == null) {
            $$$reportNull$$$0(9);
        }
        aiea<K, V> aieaVarCreateMemoizedFunction = createMemoizedFunction(afecVar, createConcurrentHashMap());
        if (aieaVarCreateMemoizedFunction == null) {
            $$$reportNull$$$0(10);
        }
        return aieaVarCreateMemoizedFunction;
    }

    @Override // defpackage.aiei
    public <K, V> aieb<K, V> createMemoizedFunctionWithNullableValues(afec<? super K, ? extends V> afecVar) {
        if (afecVar == null) {
            $$$reportNull$$$0(19);
        }
        aieb<K, V> aiebVarCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(afecVar, createConcurrentHashMap());
        if (aiebVarCreateMemoizedFunctionWithNullableValues == null) {
            $$$reportNull$$$0(20);
        }
        return aiebVarCreateMemoizedFunctionWithNullableValues;
    }

    @Override // defpackage.aiei
    public <T> aied<T> createNullableLazyValue(afdr<? extends T> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(30);
        }
        return new aidr(this, afdrVar);
    }

    @Override // defpackage.aiei
    public <T> aiec<T> createRecursionTolerantLazyValue(afdr<? extends T> afdrVar, T t) {
        if (afdrVar == null) {
            $$$reportNull$$$0(26);
        }
        if (t == null) {
            $$$reportNull$$$0(27);
        }
        return new aidj(this, this, afdrVar, t);
    }

    protected <K, V> aidy<V> recursionDetectedDefault(String str, K k) {
        String strConcat;
        if (str == null) {
            $$$reportNull$$$0(35);
        }
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (k == null) {
            strConcat = "";
        } else {
            Objects.toString(k);
            strConcat = "on input: ".concat(k.toString());
        }
        sb.append(strConcat);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        sanitizeStackTrace(assertionError);
        throw assertionError;
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.debugText + ")";
    }

    public <K, V> aiea<K, V> createMemoizedFunction(afec<? super K, ? extends V> afecVar, ConcurrentMap<K, Object> concurrentMap) {
        if (afecVar == null) {
            $$$reportNull$$$0(14);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(15);
        }
        return new aidw(this, concurrentMap, afecVar);
    }

    public <K, V> aieb<K, V> createMemoizedFunctionWithNullableValues(afec<? super K, ? extends V> afecVar, ConcurrentMap<K, Object> concurrentMap) {
        if (afecVar == null) {
            $$$reportNull$$$0(21);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(22);
        }
        return new aidv(this, concurrentMap, afecVar);
    }

    public aidz(String str) {
        this(str, (Runnable) null, (afec<InterruptedException, afak>) null);
    }

    public /* synthetic */ aidz(String str, aidp aidpVar, aief aiefVar, aidi aidiVar) {
        this(str, aidpVar, aiefVar);
    }

    public aidz(String str, Runnable runnable, afec<InterruptedException, afak> afecVar) {
        this(str, aidp.THROW, aief.Companion.simpleLock(runnable, afecVar));
    }
}
