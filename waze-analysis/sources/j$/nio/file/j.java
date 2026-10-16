package j$.nio.file;

import j$.nio.file.spi.FileSystemProvider;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49754a;

    public /* synthetic */ j(int i2) {
        this.f49754a = i2;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.f49754a) {
            case 0:
                FileSystemProvider fileSystemProvider = j$.adapter.b.f49639a;
                String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
                if (property != null) {
                    for (String str : property.split(",")) {
                        try {
                            fileSystemProvider = (FileSystemProvider) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(FileSystemProvider.class).newInstance(fileSystemProvider);
                            if (!fileSystemProvider.getScheme().equals("file")) {
                                throw new Error("Default provider must use scheme 'file'");
                            }
                        } catch (Exception e2) {
                            throw new Error(e2);
                        }
                    }
                }
                return fileSystemProvider;
            case 1:
                Object obj = FileSystemProvider.f49771a;
                ArrayList arrayList = new ArrayList();
                Iterator it = ServiceLoader.load(FileSystemProvider.class, ClassLoader.getSystemClassLoader()).iterator();
                while (it.hasNext()) {
                    FileSystemProvider fileSystemProvider2 = (FileSystemProvider) it.next();
                    String scheme = fileSystemProvider2.getScheme();
                    if (!scheme.equalsIgnoreCase("file")) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                if (((FileSystemProvider) obj2).getScheme().equalsIgnoreCase(scheme)) {
                                    break;
                                }
                            } else {
                                arrayList.add(fileSystemProvider2);
                            }
                        }
                    }
                }
                return arrayList;
            case 2:
                String property2 = System.getProperty("file.encoding");
                if (property2 == null) {
                    return null;
                }
                return property2;
            case 3:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 4:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
