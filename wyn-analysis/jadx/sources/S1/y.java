package S1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public final class y extends AbstractC0827c {

    /* renamed from: e, reason: collision with root package name */
    public final Context f10914e;

    /* renamed from: f, reason: collision with root package name */
    public k f10915f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f10916g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f10917h;

    /* renamed from: i, reason: collision with root package name */
    public long f10918i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10919j;

    public y(Context context) {
        super(false);
        this.f10914e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i5) {
        return Uri.parse("rawresource:///" + i5);
    }

    @Override // S1.h
    public final void close() {
        this.f10915f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f10917h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f10917h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f10916g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new x(2000, e7, null);
                    }
                } finally {
                    this.f10916g = null;
                    if (this.f10919j) {
                        this.f10919j = false;
                        l();
                    }
                }
            } catch (IOException e10) {
                throw new x(2000, e10, null);
            }
        } catch (Throwable th) {
            this.f10917h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f10916g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f10916g = null;
                    if (this.f10919j) {
                        this.f10919j = false;
                        l();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new x(2000, e11, null);
                }
            } finally {
                this.f10916g = null;
                if (this.f10919j) {
                    this.f10919j = false;
                    l();
                }
            }
        }
    }

    @Override // S1.h
    public final Uri k() {
        k kVar = this.f10915f;
        if (kVar != null) {
            return kVar.f10870a;
        }
        return null;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f10918i;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i10 = (int) Math.min(j8, i10);
                } catch (IOException e7) {
                    throw new x(2000, e7, null);
                }
            }
            FileInputStream fileInputStream = this.f10917h;
            int i11 = Q1.x.f9724a;
            int i12 = fileInputStream.read(bArr, i5, i10);
            if (i12 != -1) {
                long j10 = this.f10918i;
                if (j10 != -1) {
                    this.f10918i = j10 - i12;
                }
                b(i12);
                return i12;
            }
            if (this.f10918i != -1) {
                throw new x(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }

    @Override // S1.h
    public final long y(k kVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, i {
        Resources resourcesForApplication;
        int identifier;
        int i5;
        Resources resources;
        this.f10915f = kVar;
        m();
        Uri uriNormalizeScheme = kVar.f10870a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f10914e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new x(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i5 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new x(1004, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new x(1004, null, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.");
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new x(2005, e7, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new x(1004, null, "Resource identifier must be an integer.");
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(N0.a.g(packageName, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, path), "raw", null);
                if (identifier == 0) {
                    throw new x(2005, null, "Resource not found.");
                }
            }
            i5 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i5);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new x(2000, null, pd.f.k(uriNormalizeScheme, "Resource is compressed: "));
            }
            this.f10916g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f10916g.getFileDescriptor());
            this.f10917h = fileInputStream;
            long j8 = kVar.f10874e;
            try {
                if (length != -1 && j8 > length) {
                    throw new x(2008, null, null);
                }
                long startOffset = this.f10916g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j8) - startOffset;
                if (jSkip != j8) {
                    throw new x(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f10918i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f10918i = size;
                        if (size < 0) {
                            throw new x(2008, null, null);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.f10918i = j10;
                    if (j10 < 0) {
                        throw new i(2008);
                    }
                }
                long j11 = kVar.f10875f;
                if (j11 != -1) {
                    long j12 = this.f10918i;
                    this.f10918i = j12 == -1 ? j11 : Math.min(j12, j11);
                }
                this.f10919j = true;
                o(kVar);
                return j11 != -1 ? j11 : this.f10918i;
            } catch (x e10) {
                throw e10;
            } catch (IOException e11) {
                throw new x(2000, e11, null);
            }
        } catch (Resources.NotFoundException e12) {
            throw new x(2005, e12, null);
        }
    }
}
