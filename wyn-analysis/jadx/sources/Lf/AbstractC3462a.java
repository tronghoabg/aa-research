package lf;

import com.unity3d.ads.metadata.MediationMetaData;
import ef.C2515C;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: lf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3462a implements InterfaceC3103c, InterfaceC3465d, Serializable {

    @Nullable
    private final InterfaceC3103c<Object> completion;

    public AbstractC3462a(InterfaceC3103c interfaceC3103c) {
        this.completion = interfaceC3103c;
    }

    @NotNull
    public InterfaceC3103c<C2515C> create(@NotNull InterfaceC3103c<?> completion) {
        AbstractC3340k.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public InterfaceC3465d getCallerFrame() {
        InterfaceC3103c<Object> interfaceC3103c = this.completion;
        if (interfaceC3103c instanceof InterfaceC3465d) {
            return (InterfaceC3465d) interfaceC3103c;
        }
        return null;
    }

    @Nullable
    public final InterfaceC3103c<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC3466e interfaceC3466e = (InterfaceC3466e) getClass().getAnnotation(InterfaceC3466e.class);
        String str = null;
        if (interfaceC3466e == null || interfaceC3466e.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i5 = iIntValue >= 0 ? interfaceC3466e.l()[iIntValue] : -1;
        C3467f c3467f = AbstractC3468g.f40283b;
        C3467f c3467f2 = AbstractC3468g.f40282a;
        if (c3467f == null) {
            try {
                C3467f c3467f3 = new C3467f(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(MediationMetaData.KEY_NAME, new Class[0]));
                AbstractC3468g.f40283b = c3467f3;
                c3467f = c3467f3;
            } catch (Exception unused2) {
                AbstractC3468g.f40283b = c3467f2;
                c3467f = c3467f2;
            }
        }
        if (c3467f != c3467f2 && (method = c3467f.f40279a) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = c3467f.f40280b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = c3467f.f40281c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = interfaceC3466e.c();
        } else {
            strC = str + '/' + interfaceC3466e.c();
        }
        return new StackTraceElement(strC, interfaceC3466e.m(), interfaceC3466e.f(), i5);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jf.InterfaceC3103c
    public final void resumeWith(@NotNull Object obj) {
        InterfaceC3103c interfaceC3103c = this;
        while (true) {
            AbstractC3462a abstractC3462a = (AbstractC3462a) interfaceC3103c;
            InterfaceC3103c interfaceC3103c2 = abstractC3462a.completion;
            AbstractC3340k.b(interfaceC3103c2);
            try {
                obj = abstractC3462a.invokeSuspend(obj);
                if (obj == kf.a.f39711a) {
                    return;
                }
            } catch (Throwable th) {
                obj = Fe.e.z(th);
            }
            abstractC3462a.releaseIntercepted();
            if (!(interfaceC3103c2 instanceof AbstractC3462a)) {
                interfaceC3103c2.resumeWith(obj);
                return;
            }
            interfaceC3103c = interfaceC3103c2;
        }
    }

    @NotNull
    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> completion) {
        AbstractC3340k.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
