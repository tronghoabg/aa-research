package androidx.camera.core.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class MultiValueSet<C> {
    private Set<C> mSet = new HashSet();

    public void addAll(List<C> list) {
        this.mSet.addAll(list);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract MultiValueSet<C> m1374clone();

    public List<C> getAllItems() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.mSet));
    }
}
