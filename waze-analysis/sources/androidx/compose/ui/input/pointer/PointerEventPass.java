package androidx.compose.ui.input.pointer;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerEventPass {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PointerEventPass[] $VALUES;
    public static final PointerEventPass Initial = new PointerEventPass("Initial", 0);
    public static final PointerEventPass Main = new PointerEventPass("Main", 1);
    public static final PointerEventPass Final = new PointerEventPass("Final", 2);

    private static final /* synthetic */ PointerEventPass[] $values() {
        return new PointerEventPass[]{Initial, Main, Final};
    }

    static {
        PointerEventPass[] pointerEventPassArr$values = $values();
        $VALUES = pointerEventPassArr$values;
        $ENTRIES = b.a(pointerEventPassArr$values);
    }

    private PointerEventPass(String str, int i2) {
    }

    public static a<PointerEventPass> getEntries() {
        return $ENTRIES;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) $VALUES.clone();
    }
}
