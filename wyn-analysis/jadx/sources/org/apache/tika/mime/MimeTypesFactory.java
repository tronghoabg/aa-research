package org.apache.tika.mime;

import j$.util.Collection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import org.w3c.dom.Document;
import vg.b;
import vg.d;

/* loaded from: classes5.dex */
public class MimeTypesFactory {
    public static final String CUSTOM_MIMES_SYS_PROP = "tika.custom-mimetypes";
    private static final b LOG = d.b(MimeTypesFactory.class);

    public static MimeTypes create() {
        return new MimeTypes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$0(URL url) {
        LOG.u(url, "Loaded custom mimes file: {}");
    }

    public static MimeTypes create(Document document) throws MimeTypeException {
        MimeTypes mimeTypes = new MimeTypes();
        new MimeTypesReader(mimeTypes).read(document);
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream... inputStreamArr) throws IOException, MimeTypeException {
        MimeTypes mimeTypes = new MimeTypes();
        MimeTypesReader mimeTypesReader = new MimeTypesReader(mimeTypes);
        for (InputStream inputStream : inputStreamArr) {
            mimeTypesReader.read(inputStream);
        }
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream inputStream) throws IOException, MimeTypeException {
        return create(inputStream);
    }

    public static MimeTypes create(URL... urlArr) throws IOException, MimeTypeException {
        int length = urlArr.length;
        InputStream[] inputStreamArr = new InputStream[length];
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            inputStreamArr[i10] = urlArr[i10].openStream();
        }
        try {
            return create(inputStreamArr);
        } finally {
            while (i5 < length) {
                inputStreamArr[i5].close();
                i5++;
            }
        }
    }

    public static MimeTypes create(URL url) throws IOException, MimeTypeException {
        return create(url);
    }

    public static MimeTypes create(String str) throws IOException, MimeTypeException {
        return create(MimeTypesReader.class.getResource(str));
    }

    public static MimeTypes create(String str, String str2) throws IOException, MimeTypeException {
        return create(str, str2, null);
    }

    public static MimeTypes create(String str, String str2, ClassLoader classLoader) throws IOException, MimeTypeException {
        if (classLoader == null) {
            classLoader = MimeTypesReader.class.getClassLoader();
        }
        URL resource = classLoader.getResource(N0.a.f(MimeTypesReader.class.getPackage().getName().replace('.', '/'), "/") + str);
        ArrayList list = Collections.list(classLoader.getResources(str2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        arrayList.addAll(list);
        b bVar = LOG;
        if (bVar.b()) {
            Collection.EL.stream(arrayList).forEach(new a(0));
        }
        String property = System.getProperty(CUSTOM_MIMES_SYS_PROP);
        if (property != null) {
            File file = new File(property);
            if (file.exists()) {
                arrayList.add(file.toURI().toURL());
                if (bVar.b()) {
                    bVar.u(file.getAbsolutePath(), "Loaded external custom mimetypes file: {}");
                }
            } else {
                throw new IOException("Specified custom mimetypes file not found: ".concat(property));
            }
        }
        return create((URL[]) arrayList.toArray(new URL[0]));
    }
}
