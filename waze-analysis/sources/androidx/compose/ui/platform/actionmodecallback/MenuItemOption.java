package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import h.d.a;
import h.d.b;
import h.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MenuItemOption {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MenuItemOption[] $VALUES;
    private final int id;
    private final int order;
    public static final MenuItemOption Copy = new MenuItemOption("Copy", 0, R.id.copy, 0);
    public static final MenuItemOption Paste = new MenuItemOption("Paste", 1, R.id.paste, 1);
    public static final MenuItemOption Cut = new MenuItemOption("Cut", 2, R.id.cut, 2);
    public static final MenuItemOption SelectAll = new MenuItemOption("SelectAll", 3, R.id.selectAll, 3);
    public static final MenuItemOption Autofill = new MenuItemOption("Autofill", 4, R.id.autofill, 4);

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[MenuItemOption.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemOption.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemOption.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemOption.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MenuItemOption[] $values() {
        return new MenuItemOption[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    static {
        MenuItemOption[] menuItemOptionArr$values = $values();
        $VALUES = menuItemOptionArr$values;
        $ENTRIES = b.a(menuItemOptionArr$values);
    }

    private MenuItemOption(String str, int i2, int i3, int i4) {
        this.id = i3;
        this.order = i4;
    }

    public static a<MenuItemOption> getEntries() {
        return $ENTRIES;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return R.string.copy;
        }
        if (iOrdinal == 1) {
            return R.string.paste;
        }
        if (iOrdinal == 2) {
            return R.string.cut;
        }
        if (iOrdinal == 3) {
            return R.string.selectAll;
        }
        if (iOrdinal == 4) {
            return R.string.autofill;
        }
        throw new i();
    }
}
