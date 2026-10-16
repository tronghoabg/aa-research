package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import h.g.b.o;
import h.g.b.x;
import h.i.a;
import h.l.r;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseKeyFrameScope {
    public static final int $stable = 8;
    private final Map<String, Object> customPropertiesValue;
    private final Map<String, Object> keyFramePropertiesValue;

    private BaseKeyFrameScope() {
        this.keyFramePropertiesValue = new LinkedHashMap();
        this.customPropertiesValue = new LinkedHashMap();
    }

    public static /* synthetic */ a addNameOnPropertyChange$default(BaseKeyFrameScope baseKeyFrameScope, NamedPropertyOrValue namedPropertyOrValue, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNameOnPropertyChange");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return baseKeyFrameScope.addNameOnPropertyChange(namedPropertyOrValue, str);
    }

    public static /* synthetic */ a addOnPropertyChange$default(BaseKeyFrameScope baseKeyFrameScope, Object obj, String str, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnPropertyChange");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return baseKeyFrameScope.addOnPropertyChange(obj, str);
    }

    private final void putValuesAsArrayElements(CLContainer cLContainer, Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            CLArray arrayOrCreate = cLContainer.getArrayOrCreate(key);
            if (value instanceof String) {
                char[] charArray = ((String) value).toCharArray();
                x.e(charArray, "toCharArray(...)");
                CLString cLString = new CLString(charArray);
                cLString.setStart(0L);
                cLString.setEnd(charArray.length - 1);
                arrayOrCreate.add(cLString);
            } else if (value instanceof Dp) {
                arrayOrCreate.add(new CLNumber(((Dp) value).m11178unboximpl()));
            } else if (value instanceof Number) {
                arrayOrCreate.add(new CLNumber(((Number) value).floatValue()));
            }
        }
    }

    protected final <E extends NamedPropertyOrValue> a<E> addNameOnPropertyChange(E e2, final String str) {
        return new a(e2) { // from class: androidx.constraintlayout.compose.BaseKeyFrameScope.addNameOnPropertyChange.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // h.i.a
            public void afterChange(r rVar, NamedPropertyOrValue namedPropertyOrValue, NamedPropertyOrValue namedPropertyOrValue2) {
                String name = str;
                if (name == null) {
                    name = rVar.getName();
                }
                if (namedPropertyOrValue2 != null) {
                    this.keyFramePropertiesValue.put(name, namedPropertyOrValue2.getName());
                }
            }
        };
    }

    protected final <T> a<T> addOnPropertyChange(T t, final String str) {
        return new a(t) { // from class: androidx.constraintlayout.compose.BaseKeyFrameScope.addOnPropertyChange.1
            @Override // h.i.a
            protected void afterChange(r rVar, Object obj, Object obj2) {
                BaseKeyFrameScope baseKeyFrameScope = this;
                String name = str;
                if (obj2 != null) {
                    Map map = baseKeyFrameScope.keyFramePropertiesValue;
                    if (name == null) {
                        name = rVar.getName();
                    }
                    map.put(name, obj2);
                    return;
                }
                Map map2 = baseKeyFrameScope.keyFramePropertiesValue;
                if (name == null) {
                    name = rVar.getName();
                }
                map2.remove(name);
            }
        };
    }

    public final void addToContainer$constraintlayout_compose(CLContainer cLContainer) {
        putValuesAsArrayElements(cLContainer, this.keyFramePropertiesValue);
        CLObject objectOrNull = cLContainer.getObjectOrNull("custom");
        if (objectOrNull == null) {
            objectOrNull = new CLObject(new char[0]);
            cLContainer.put("custom", objectOrNull);
        }
        putValuesAsArrayElements(objectOrNull, this.customPropertiesValue);
    }

    public final Map<String, Object> getCustomPropertiesValue$constraintlayout_compose() {
        return this.customPropertiesValue;
    }

    public /* synthetic */ BaseKeyFrameScope(o oVar) {
        this();
    }
}
