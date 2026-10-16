package androidx.compose.ui.tooling.data;

import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import h.a.i;
import h.g.b.o;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class Group {
    public static final int $stable = 8;
    private final IntRect box;
    private final Collection<Group> children;
    private final Collection<Object> data;
    private final Object identity;
    private final boolean isInline;
    private final Object key;
    private final SourceLocation location;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    private Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection<? extends Object> collection, Collection<? extends Group> collection2, boolean z) {
        this.key = obj;
        this.name = str;
        this.location = sourceLocation;
        this.identity = obj2;
        this.box = intRect;
        this.data = collection;
        this.children = collection2;
        this.isInline = z;
    }

    public final IntRect getBox() {
        return this.box;
    }

    public final Collection<Group> getChildren() {
        return this.children;
    }

    public final Collection<Object> getData() {
        return this.data;
    }

    public final Object getIdentity() {
        return this.identity;
    }

    public final Object getKey() {
        return this.key;
    }

    public final SourceLocation getLocation() {
        return this.location;
    }

    public List<ModifierInfo> getModifierInfo() {
        return i.h();
    }

    public final String getName() {
        return this.name;
    }

    public List<ParameterInformation> getParameters() {
        return i.h();
    }

    public final boolean isInline() {
        return this.isInline;
    }

    public /* synthetic */ Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection collection, Collection collection2, boolean z, o oVar) {
        this(obj, str, sourceLocation, obj2, intRect, collection, collection2, z);
    }
}
