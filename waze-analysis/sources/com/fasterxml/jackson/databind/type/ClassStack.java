package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this._selfRefs = arrayList;
        }
        arrayList.add(resolvedRecursiveType);
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        do {
            this = this._parent;
            if (this == null) {
                return null;
            }
        } while (this._current != cls);
        return this;
    }

    public void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).setReference(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb.append(')');
        while (this != null) {
            sb.append(' ');
            sb.append(this._current.getName());
            this = this._parent;
        }
        sb.append(']');
        return sb.toString();
    }

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }
}
