package androidx.compose.runtime.composer.linkbuffer.changelist;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposerChangeListWriterAddressMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ComposerChangeListWriterAddressMode[] $VALUES;
    public static final ComposerChangeListWriterAddressMode AbsoluteAddressing = new ComposerChangeListWriterAddressMode("AbsoluteAddressing", 0);
    public static final ComposerChangeListWriterAddressMode AnchorAddressing = new ComposerChangeListWriterAddressMode("AnchorAddressing", 1);
    public static final ComposerChangeListWriterAddressMode RelativeAddressing = new ComposerChangeListWriterAddressMode("RelativeAddressing", 2);

    private static final /* synthetic */ ComposerChangeListWriterAddressMode[] $values() {
        return new ComposerChangeListWriterAddressMode[]{AbsoluteAddressing, AnchorAddressing, RelativeAddressing};
    }

    static {
        ComposerChangeListWriterAddressMode[] composerChangeListWriterAddressModeArr$values = $values();
        $VALUES = composerChangeListWriterAddressModeArr$values;
        $ENTRIES = b.a(composerChangeListWriterAddressModeArr$values);
    }

    private ComposerChangeListWriterAddressMode(String str, int i2) {
    }

    public static a<ComposerChangeListWriterAddressMode> getEntries() {
        return $ENTRIES;
    }

    public static ComposerChangeListWriterAddressMode valueOf(String str) {
        return (ComposerChangeListWriterAddressMode) Enum.valueOf(ComposerChangeListWriterAddressMode.class, str);
    }

    public static ComposerChangeListWriterAddressMode[] values() {
        return (ComposerChangeListWriterAddressMode[]) $VALUES.clone();
    }
}
