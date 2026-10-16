package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SearchBarValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SearchBarValue[] $VALUES;
    public static final SearchBarValue Collapsed = new SearchBarValue("Collapsed", 0);
    public static final SearchBarValue Expanded = new SearchBarValue("Expanded", 1);

    private static final /* synthetic */ SearchBarValue[] $values() {
        return new SearchBarValue[]{Collapsed, Expanded};
    }

    static {
        SearchBarValue[] searchBarValueArr$values = $values();
        $VALUES = searchBarValueArr$values;
        $ENTRIES = b.a(searchBarValueArr$values);
    }

    private SearchBarValue(String str, int i2) {
    }

    public static a<SearchBarValue> getEntries() {
        return $ENTRIES;
    }

    public static SearchBarValue valueOf(String str) {
        return (SearchBarValue) Enum.valueOf(SearchBarValue.class, str);
    }

    public static SearchBarValue[] values() {
        return (SearchBarValue[]) $VALUES.clone();
    }
}
