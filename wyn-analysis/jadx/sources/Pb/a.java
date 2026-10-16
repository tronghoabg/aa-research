package Pb;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f9291a = new ArrayList(Arrays.asList("/dev/socket/genyd", "/dev/socket/baseband_genyd"));

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f9292b = new ArrayList(Arrays.asList("/dev/socket/qemud", "/dev/qemu_pipe"));

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f9293c = new ArrayList(Arrays.asList("ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"));

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f9294d = new ArrayList(Arrays.asList("fstab.andy", "ueventd.andy.rc"));

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayList f9295e = new ArrayList(Arrays.asList("fstab.nox", "init.nox.rc", "ueventd.nox.rc"));

    /* renamed from: f, reason: collision with root package name */
    public static final ArrayList f9296f = new ArrayList(Arrays.asList("/system/lib/libc_malloc_debug_qemu.so", "/system/bin/microvirt-prop", "/system/bin/microvirt-uiautomator", "/system/bin/microvirtd", "/system/xbin/microvirt-prop"));

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayList f9297g = new ArrayList(Arrays.asList("fstab.memu", "init.memu.rc", "ueventd.memu.rc"));

    public static boolean a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (new File((String) it.next()).exists()) {
                return true;
            }
        }
        return false;
    }
}
