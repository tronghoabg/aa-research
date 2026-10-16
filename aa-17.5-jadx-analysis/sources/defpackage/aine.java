package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class aine<K, T> extends aimy<K, T> {
    private aina<T> arrayMap;

    /* JADX WARN: Illegal instructions before constructor call */
    public aine() {
        ainq ainqVar = ainq.INSTANCE;
        ainqVar.getClass();
        this(ainqVar);
    }

    private final String buildDiagnosticMessage(aina<T> ainaVar, int i, String str) {
        T next;
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        Class<?> cls = ainaVar.getClass();
        Objects.toString(cls);
        sb.append("Type: ".concat(String.valueOf(cls)));
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder();
        Map<String, Integer> mapAllValuesThreadUnsafeForRendering = getTypeRegistry().allValuesThreadUnsafeForRendering();
        sb2.append("[\n");
        ArrayList arrayList = new ArrayList(woy.bp(ainaVar, 10));
        int i2 = 0;
        for (T t : ainaVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                woy.bo();
            }
            Iterator<T> it = mapAllValuesThreadUnsafeForRendering.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                    break;
                }
            }
            sb2.append("  " + ((Map.Entry) next) + '[' + i2 + "]: " + t);
            sb2.append('\n');
            arrayList.add(sb2);
            i2 = i3;
        }
        sb2.append("]\n");
        sb.append("Content: ".concat(sb2.toString()));
        sb.append('\n');
        return sb.toString();
    }

    @Override // defpackage.aimy
    protected final aina<T> getArrayMap() {
        return this.arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aimy
    protected final void registerComponent(String str, T t) {
        str.getClass();
        t.getClass();
        int id = getTypeRegistry().getId(str);
        int size = this.arrayMap.getSize();
        if (size == 0) {
            aina<T> ainaVar = this.arrayMap;
            if (!(ainaVar instanceof ainq)) {
                throw new IllegalStateException(buildDiagnosticMessage(ainaVar, 0, "EmptyArrayMap"));
            }
            this.arrayMap = new aioa(t, id);
            return;
        }
        if (size == 1) {
            aina<T> ainaVar2 = this.arrayMap;
            try {
                ainaVar2.getClass();
                aioa aioaVar = (aioa) ainaVar2;
                if (aioaVar.getIndex() == id) {
                    this.arrayMap = new aioa(t, id);
                    return;
                } else {
                    aind aindVar = new aind();
                    aindVar.set(aioaVar.getIndex(), aioaVar.getValue());
                    this.arrayMap = aindVar;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException(buildDiagnosticMessage(ainaVar2, 1, "OneElementArrayMap"), e);
            }
        }
        this.arrayMap.set(id, t);
    }

    protected aine(aina<T> ainaVar) {
        ainaVar.getClass();
        this.arrayMap = ainaVar;
    }
}
