package org.apache.tika.config;

import A7.AbstractC0279p0;
import N0.a;
import R8.v;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.concurrent.ConfigurableThreadPoolExecutor;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.CompositeEncodingDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.filter.NoOpFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.mime.MimeTypesFactory;
import org.apache.tika.parser.AbstractEncodingDetectorParser;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.AutoDetectParserConfig;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.RenderingParser;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.renderer.CompositeRenderer;
import org.apache.tika.renderer.Renderer;
import org.apache.tika.utils.AnnotationUtils;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import vg.b;
import vg.d;

/* loaded from: classes5.dex */
public class TikaConfig {
    public static int DEFAULT_MAX_JSON_STRING_FIELD_LENGTH = 20000000;
    private static int MAX_JSON_STRING_FIELD_LENGTH = 0;
    public static String MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME = "maxJsonStringFieldLength";
    private static final Map<String, InitializableProblemHandler> strategyMap;
    private final AutoDetectParserConfig autoDetectParserConfig;
    private final CompositeDetector detector;
    private final EncodingDetector encodingDetector;
    private final ExecutorService executorService;
    private final MetadataFilter metadataFilter;
    private final MetadataListFilter metadataListFilter;
    private final MimeTypes mimeTypes;
    private final CompositeParser parser;
    private final Renderer renderer;
    private final ServiceLoader serviceLoader;
    private final Translator translator;
    protected static final AtomicInteger TIMES_INSTANTIATED = new AtomicInteger();
    private static final b LOG = d.b(TikaConfig.class);

    public static class DetectorXmlLoader extends XmlLoader<CompositeDetector, Detector> {
        public /* synthetic */ DetectorXmlLoader(int i5) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Detector createComposite(Class<? extends Detector> cls, List<Detector> list, Set<Class<? extends Detector>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Detector decorate(Detector detector, Element element) {
            return detector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Detector> getLoaderClass() {
            return Detector.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "detector";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "detectors";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private DetectorXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeDetector createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultDetector(mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Detector detector) {
            return detector instanceof CompositeDetector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Detector preLoadOne(Class<? extends Detector> cls, String str, MimeTypes mimeTypes) {
            if (MimeTypes.class.equals(cls)) {
                return mimeTypes;
            }
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeDetector createComposite(List<Detector> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeDetector(mimeTypes.getMediaTypeRegistry(), list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Detector> cls) {
            return CompositeDetector.class.isAssignableFrom(cls);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite, reason: avoid collision after fix types in other method */
        public Detector createComposite2(Class<? extends Detector> cls, List<Detector> list, Set<Class<? extends Detector>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Detector detectorNewInstance;
            MediaTypeRegistry mediaTypeRegistry = mimeTypes.getMediaTypeRegistry();
            try {
                detectorNewInstance = cls.getConstructor(MimeTypes.class, ServiceLoader.class, Collection.class).newInstance(mimeTypes, serviceLoader, set);
            } catch (NoSuchMethodException unused) {
                detectorNewInstance = null;
            }
            if (detectorNewInstance == null) {
                try {
                    detectorNewInstance = cls.getConstructor(MediaTypeRegistry.class, List.class, Collection.class).newInstance(mediaTypeRegistry, list, set);
                } catch (NoSuchMethodException unused2) {
                }
            }
            if (detectorNewInstance == null) {
                try {
                    detectorNewInstance = cls.getConstructor(MediaTypeRegistry.class, List.class).newInstance(mediaTypeRegistry, list);
                } catch (NoSuchMethodException unused3) {
                }
            }
            if (detectorNewInstance != null) {
                return detectorNewInstance;
            }
            try {
                return cls.getConstructor(List.class).newInstance(list);
            } catch (NoSuchMethodException unused4) {
                return detectorNewInstance;
            }
        }
    }

    public static class EncodingDetectorXmlLoader extends XmlLoader<EncodingDetector, EncodingDetector> {
        public /* synthetic */ EncodingDetectorXmlLoader(int i5) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ EncodingDetector createComposite(Class<? extends EncodingDetector> cls, List<EncodingDetector> list, Set<Class<? extends EncodingDetector>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector decorate(EncodingDetector encodingDetector, Element element) {
            return encodingDetector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends EncodingDetector> getLoaderClass() {
            return EncodingDetector.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "encodingDetector";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "encodingDetectors";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector preLoadOne(Class<? extends EncodingDetector> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private EncodingDetectorXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultEncodingDetector(serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(EncodingDetector encodingDetector) {
            return encodingDetector instanceof CompositeEncodingDetector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector createComposite(List<EncodingDetector> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeEncodingDetector(list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends EncodingDetector> cls) {
            return CompositeEncodingDetector.class.isAssignableFrom(cls);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite, reason: avoid collision after fix types in other method */
        public EncodingDetector createComposite2(Class<? extends EncodingDetector> cls, List<EncodingDetector> list, Set<Class<? extends EncodingDetector>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            EncodingDetector encodingDetectorNewInstance;
            try {
                encodingDetectorNewInstance = cls.getConstructor(ServiceLoader.class, Collection.class).newInstance(serviceLoader, set);
            } catch (NoSuchMethodException unused) {
                TikaConfig.LOG.u(cls, "couldn't find constructor for service loader + collection for {}");
                encodingDetectorNewInstance = null;
            }
            if (encodingDetectorNewInstance != null) {
                return encodingDetectorNewInstance;
            }
            try {
                return cls.getConstructor(List.class).newInstance(list);
            } catch (NoSuchMethodException unused2) {
                TikaConfig.LOG.u(cls, "couldn't find constructor for EncodingDetector(List) for {}");
                return encodingDetectorNewInstance;
            }
        }
    }

    public static class ExecutorServiceXmlLoader extends XmlLoader<ConfigurableThreadPoolExecutor, ConfigurableThreadPoolExecutor> {
        public /* synthetic */ ExecutorServiceXmlLoader(int i5) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ ConfigurableThreadPoolExecutor createComposite(Class<? extends ConfigurableThreadPoolExecutor> cls, List<ConfigurableThreadPoolExecutor> list, Set<Class<? extends ConfigurableThreadPoolExecutor>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends ConfigurableThreadPoolExecutor> getLoaderClass() {
            return ConfigurableThreadPoolExecutor.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "executor-service";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends ConfigurableThreadPoolExecutor> cls) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor preLoadOne(Class<? extends ConfigurableThreadPoolExecutor> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return false;
        }

        private ExecutorServiceXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultExecutorService();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor decorate(ConfigurableThreadPoolExecutor configurableThreadPoolExecutor, Element element) {
            Element child = TikaConfig.getChild(element, "max-threads");
            if (child != null) {
                configurableThreadPoolExecutor.setMaximumPoolSize(Integer.parseInt(TikaConfig.getText(child)));
            }
            Element child2 = TikaConfig.getChild(element, "core-threads");
            if (child2 != null) {
                configurableThreadPoolExecutor.setCorePoolSize(Integer.parseInt(TikaConfig.getText(child2)));
            }
            return configurableThreadPoolExecutor;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(ConfigurableThreadPoolExecutor configurableThreadPoolExecutor) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor loadOne(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            return (ConfigurableThreadPoolExecutor) super.loadOne(element, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite, reason: avoid collision after fix types in other method */
        public ConfigurableThreadPoolExecutor createComposite2(Class<? extends ConfigurableThreadPoolExecutor> cls, List<ConfigurableThreadPoolExecutor> list, Set<Class<? extends ConfigurableThreadPoolExecutor>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InstantiationException {
            throw new InstantiationException("Only one executor service supported");
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor createComposite(List<ConfigurableThreadPoolExecutor> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return list.get(0);
        }
    }

    public static class ParserXmlLoader extends XmlLoader<CompositeParser, Parser> {
        private final EncodingDetector encodingDetector;
        private final Renderer renderer;

        public /* synthetic */ ParserXmlLoader(EncodingDetector encodingDetector, Renderer renderer, int i5) {
            this(encodingDetector, renderer);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Parser createComposite(Class<? extends Parser> cls, List<Parser> list, Set<Class<? extends Parser>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Parser> getLoaderClass() {
            return Parser.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return ExternalParsersConfigReaderMetKeys.PARSER_TAG;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "parsers";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private ParserXmlLoader(EncodingDetector encodingDetector, Renderer renderer) {
            super(0);
            this.encodingDetector = encodingDetector;
            this.renderer = renderer;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeParser createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultParser(mimeTypes, serviceLoader, this.encodingDetector, this.renderer);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Parser decorate(Parser parser, Element element) throws TikaException {
            Set setMediaTypesListFromDomElement = TikaConfig.mediaTypesListFromDomElement(element, "mime");
            if (!setMediaTypesListFromDomElement.isEmpty()) {
                parser = ParserDecorator.withTypes(parser, setMediaTypesListFromDomElement);
            }
            Set setMediaTypesListFromDomElement2 = TikaConfig.mediaTypesListFromDomElement(element, "mime-exclude");
            return !setMediaTypesListFromDomElement2.isEmpty() ? ParserDecorator.withoutTypes(parser, setMediaTypesListFromDomElement2) : parser;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Parser parser) {
            return parser instanceof CompositeParser;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Parser newInstance(Class<? extends Parser> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
            Parser parserNewInstance = AbstractEncodingDetectorParser.class.isAssignableFrom(cls) ? cls.getConstructor(EncodingDetector.class).newInstance(this.encodingDetector) : cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (parserNewInstance instanceof RenderingParser) {
                ((RenderingParser) parserNewInstance).setRenderer(this.renderer);
            }
            return parserNewInstance;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Parser preLoadOne(Class<? extends Parser> cls, String str, MimeTypes mimeTypes) throws TikaException {
            if (AutoDetectParser.class.isAssignableFrom(cls)) {
                throw new TikaException(v.f("AutoDetectParser not supported in a <parser> configuration element: ", str));
            }
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeParser createComposite(List<Parser> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeParser(mimeTypes.getMediaTypeRegistry(), list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Parser> cls) {
            return CompositeParser.class.isAssignableFrom(cls) || AbstractMultipleParser.class.isAssignableFrom(cls) || ParserDecorator.class.isAssignableFrom(cls);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0110 A[Catch: NoSuchMethodException -> 0x012e, TryCatch #3 {NoSuchMethodException -> 0x012e, blocks: (B:31:0x00f0, B:33:0x00f8, B:35:0x00fe, B:37:0x0108, B:40:0x0117, B:39:0x0110), top: B:56:0x00f0 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public org.apache.tika.parser.Parser createComposite2(java.lang.Class<? extends org.apache.tika.parser.Parser> r19, java.util.List<org.apache.tika.parser.Parser> r20, java.util.Set<java.lang.Class<? extends org.apache.tika.parser.Parser>> r21, java.util.Map<java.lang.String, org.apache.tika.config.Param> r22, org.apache.tika.mime.MimeTypes r23, org.apache.tika.config.ServiceLoader r24) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.TikaConfig.ParserXmlLoader.createComposite2(java.lang.Class, java.util.List, java.util.Set, java.util.Map, org.apache.tika.mime.MimeTypes, org.apache.tika.config.ServiceLoader):org.apache.tika.parser.Parser");
        }
    }

    public static class RendererXmlLoader extends XmlLoader<Renderer, Renderer> {
        public /* synthetic */ RendererXmlLoader(int i5) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Renderer createComposite(Class<? extends Renderer> cls, List<Renderer> list, Set<Class<? extends Renderer>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer decorate(Renderer renderer, Element element) {
            return renderer;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Renderer> getLoaderClass() {
            return Renderer.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "renderer";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "renderers";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer preLoadOne(Class<? extends Renderer> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private RendererXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultRenderer(serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Renderer renderer) {
            return renderer instanceof CompositeRenderer;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer createComposite(List<Renderer> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeRenderer(list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Renderer> cls) {
            return CompositeRenderer.class.isAssignableFrom(cls);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite, reason: avoid collision after fix types in other method */
        public Renderer createComposite2(Class<? extends Renderer> cls, List<Renderer> list, Set<Class<? extends Renderer>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Renderer rendererNewInstance;
            try {
                rendererNewInstance = cls.getConstructor(ServiceLoader.class, Collection.class).newInstance(serviceLoader, set);
            } catch (NoSuchMethodException unused) {
                TikaConfig.LOG.u(null, "couldn't find constructor for service loader + collection for {}");
                rendererNewInstance = null;
            }
            if (rendererNewInstance != null) {
                return rendererNewInstance;
            }
            try {
                return cls.getConstructor(List.class).newInstance(list);
            } catch (NoSuchMethodException unused2) {
                TikaConfig.LOG.u(cls, "couldn't find constructor for Renderer(List) for {}");
                return rendererNewInstance;
            }
        }
    }

    public static class TranslatorXmlLoader extends XmlLoader<Translator, Translator> {
        public /* synthetic */ TranslatorXmlLoader(int i5) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Translator createComposite(Class<? extends Translator> cls, List<Translator> list, Set<Class<? extends Translator>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator decorate(Translator translator, Element element) {
            return translator;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Translator> getLoaderClass() {
            return Translator.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "translator";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Translator> cls) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator preLoadOne(Class<? extends Translator> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return false;
        }

        private TranslatorXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultTranslator(serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Translator translator) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator createComposite(List<Translator> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return list.get(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite, reason: avoid collision after fix types in other method */
        public Translator createComposite2(Class<? extends Translator> cls, List<Translator> list, Set<Class<? extends Translator>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InstantiationException {
            throw new InstantiationException("Only one translator supported");
        }
    }

    public static abstract class XmlLoader<CT, T> {
        protected static final String PARAMS_TAG_NAME = "params";

        public /* synthetic */ XmlLoader(int i5) {
            this();
        }

        public abstract T createComposite(Class<? extends T> cls, List<T> list, Set<Class<? extends T>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException;

        public abstract CT createComposite(List<T> list, MimeTypes mimeTypes, ServiceLoader serviceLoader);

        public abstract CT createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader);

        public abstract T decorate(T t10, Element element) throws TikaException, IOException;

        public abstract Class<? extends T> getLoaderClass();

        public abstract String getLoaderTagName();

        public Map<String, Param> getParams(Element element) throws IllegalAccessException, TikaException, NoSuchMethodException, DOMException, SecurityException, IllegalArgumentException, InvocationTargetException {
            HashMap map = new HashMap();
            Node firstChild = element.getFirstChild();
            while (true) {
                if (firstChild == null) {
                    break;
                }
                if (!PARAMS_TAG_NAME.equals(firstChild.getNodeName())) {
                    firstChild = firstChild.getNextSibling();
                } else if (firstChild.hasChildNodes()) {
                    NodeList childNodes = firstChild.getChildNodes();
                    for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
                        Node nodeItem = childNodes.item(i5);
                        if (nodeItem.getNodeType() == 1) {
                            Param paramLoad = Param.load(nodeItem);
                            map.put(paramLoad.getName(), paramLoad);
                        }
                    }
                }
            }
            return map;
        }

        public abstract String getParentTagName();

        public abstract boolean isComposite(Class<? extends T> cls);

        public abstract boolean isComposite(T t10);

        public T loadOne(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            InitializableProblemHandler initializableProblemHandler;
            T tNewInstance;
            MimeTypes mimeTypes2 = mimeTypes;
            ServiceLoader serviceLoader2 = serviceLoader;
            String attribute = element.getAttribute("class");
            int length = attribute.length();
            int i5 = 0;
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = attribute.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    String attribute2 = element.getAttribute("initializableProblemHandler");
                    int length2 = attribute2.length();
                    int iCharCount2 = i5;
                    while (true) {
                        if (iCharCount2 >= length2) {
                            initializableProblemHandler = serviceLoader2.getInitializableProblemHandler();
                            break;
                        }
                        int iCodePointAt2 = attribute2.codePointAt(iCharCount2);
                        if (!Character.isWhitespace(iCodePointAt2)) {
                            initializableProblemHandler = TikaConfig.getInitializableProblemHandler(attribute2);
                            break;
                        }
                        iCharCount2 += Character.charCount(iCodePointAt2);
                    }
                    InitializableProblemHandler initializableProblemHandler2 = initializableProblemHandler;
                    try {
                        try {
                            Class<? extends T> serviceClass = serviceLoader2.getServiceClass(getLoaderClass(), attribute);
                            T tPreLoadOne = preLoadOne(serviceClass, attribute, mimeTypes2);
                            if (tPreLoadOne != null) {
                                return tPreLoadOne;
                            }
                            try {
                                Map<String, Param> params = getParams(element);
                                if (isComposite((Class) serviceClass)) {
                                    ArrayList arrayList = new ArrayList();
                                    NodeList elementsByTagName = element.getElementsByTagName(getLoaderTagName());
                                    if (elementsByTagName.getLength() > 0) {
                                        for (int i10 = i5; i10 < elementsByTagName.getLength(); i10++) {
                                            T tLoadOne = loadOne((Element) elementsByTagName.item(i10), mimeTypes2, serviceLoader2);
                                            if (tLoadOne != null) {
                                                arrayList.add(tLoadOne);
                                            }
                                        }
                                    }
                                    HashSet hashSet = new HashSet();
                                    NodeList elementsByTagName2 = element.getElementsByTagName(getLoaderTagName() + "-exclude");
                                    if (elementsByTagName2.getLength() > 0) {
                                        for (int i11 = i5; i11 < elementsByTagName2.getLength(); i11++) {
                                            String attribute3 = ((Element) elementsByTagName2.item(i11)).getAttribute("class");
                                            try {
                                                hashSet.add(serviceLoader2.getServiceClass(getLoaderClass(), attribute3));
                                            } catch (ClassNotFoundException unused) {
                                                throw new TikaConfigException("Class not found in -exclude list: " + attribute3);
                                            }
                                        }
                                    }
                                    tNewInstance = createComposite(serviceClass, arrayList, hashSet, params, mimeTypes2, serviceLoader2);
                                    if (tNewInstance == null) {
                                        tNewInstance = newInstance(serviceClass);
                                    }
                                } else {
                                    tNewInstance = newInstance(serviceClass);
                                }
                                AnnotationUtils.assignFieldParams(tNewInstance, params);
                                if (tNewInstance instanceof Initializable) {
                                    ((Initializable) tNewInstance).initialize(params);
                                    ((Initializable) tNewInstance).checkInitialization(initializableProblemHandler2);
                                }
                                return decorate(tNewInstance, element);
                            } catch (Exception e7) {
                                throw new TikaConfigException(e7.getMessage(), e7);
                            }
                        } catch (ClassNotFoundException e10) {
                            if (serviceLoader.getLoadErrorHandler() == LoadErrorHandler.THROW) {
                                throw new TikaConfigException(a.h("Unable to find a ", getLoaderTagName(), " class: ", attribute), e10);
                            }
                            serviceLoader.getLoadErrorHandler().handleLoadError(attribute, e10);
                            return null;
                        }
                    } catch (IllegalAccessException e11) {
                        throw new TikaException(a.h("Unable to access a ", getLoaderTagName(), " class: ", attribute), e11);
                    } catch (InstantiationException e12) {
                        throw new TikaException(a.h("Unable to instantiate a ", getLoaderTagName(), " class: ", attribute), e12);
                    } catch (NoSuchMethodException e13) {
                        throw new TikaException(a.h("Unable to find the right constructor for ", getLoaderTagName(), " class: ", attribute), e13);
                    } catch (InvocationTargetException e14) {
                        throw new TikaException(a.h("Unable to create a ", getLoaderTagName(), " class: ", attribute), e14);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
                mimeTypes2 = mimeTypes;
                serviceLoader2 = serviceLoader;
                i5 = i5;
            }
            throw new TikaConfigException("class attribute must not be empty: " + element);
        }

        public CT loadOverall(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            ArrayList arrayList = new ArrayList();
            Iterator it = TikaConfig.getTopLevelElementChildren(element, getParentTagName(), getLoaderTagName()).iterator();
            while (it.hasNext()) {
                T tLoadOne = loadOne((Element) it.next(), mimeTypes, serviceLoader);
                if (tLoadOne != null) {
                    arrayList.add(tLoadOne);
                }
            }
            if (arrayList.isEmpty()) {
                return createDefault(mimeTypes, serviceLoader);
            }
            if (arrayList.size() == 1) {
                CT ct = (CT) arrayList.get(0);
                if (isComposite((XmlLoader<CT, T>) ct)) {
                    return ct;
                }
            } else if (!supportsComposite()) {
                throw new TikaConfigException(AbstractC0279p0.l("Composite not supported for ", getParentTagName(), ". Must specify only one child!"));
            }
            return createComposite(arrayList, mimeTypes, serviceLoader);
        }

        public T newInstance(Class<? extends T> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }

        public abstract T preLoadOne(Class<? extends T> cls, String str, MimeTypes mimeTypes) throws TikaException;

        public abstract boolean supportsComposite();

        private XmlLoader() {
        }
    }

    static {
        HashMap map = new HashMap();
        strategyMap = map;
        map.put("", InitializableProblemHandler.DEFAULT);
        InitializableProblemHandler initializableProblemHandler = InitializableProblemHandler.IGNORE;
        map.put(initializableProblemHandler.toString(), initializableProblemHandler);
        InitializableProblemHandler initializableProblemHandler2 = InitializableProblemHandler.INFO;
        map.put(initializableProblemHandler2.toString(), initializableProblemHandler2);
        InitializableProblemHandler initializableProblemHandler3 = InitializableProblemHandler.WARN;
        map.put(initializableProblemHandler3.toString(), initializableProblemHandler3);
        InitializableProblemHandler initializableProblemHandler4 = InitializableProblemHandler.THROW;
        map.put(initializableProblemHandler4.toString(), initializableProblemHandler4);
        MAX_JSON_STRING_FIELD_LENGTH = DEFAULT_MAX_JSON_STRING_FIELD_LENGTH;
    }

    public TikaConfig(String str) throws TikaException, SAXException, IOException {
        this(Paths.get(str, new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Element getChild(Element element, String str) {
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && str.equals(firstChild.getNodeName())) {
                return (Element) firstChild;
            }
        }
        return null;
    }

    private static InputStream getConfigInputStream(String str, ServiceLoader serviceLoader) throws TikaException, IOException {
        InputStream inputStreamNewInputStream;
        try {
            inputStreamNewInputStream = new URI(str).toURL().openStream();
        } catch (IOException | URISyntaxException unused) {
            inputStreamNewInputStream = null;
        }
        if (inputStreamNewInputStream == null) {
            inputStreamNewInputStream = serviceLoader.getResourceAsStream(str);
        }
        if (inputStreamNewInputStream == null) {
            Path path = Paths.get(str, new String[0]);
            if (Files.isRegularFile(path, new LinkOption[0])) {
                inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
            }
        }
        if (inputStreamNewInputStream != null) {
            return inputStreamNewInputStream;
        }
        throw new TikaException(v.f("Specified Tika configuration not found: ", str));
    }

    public static TikaConfig getDefaultConfig() {
        try {
            return new TikaConfig();
        } catch (IOException e7) {
            throw new RuntimeException("Unable to read default configuration", e7);
        } catch (TikaException e10) {
            throw new RuntimeException("Unable to access default configuration", e10);
        }
    }

    public static CompositeDetector getDefaultDetector(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
        return new DefaultDetector(mimeTypes, serviceLoader);
    }

    public static CompositeEncodingDetector getDefaultEncodingDetector(ServiceLoader serviceLoader) {
        return new DefaultEncodingDetector(serviceLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConfigurableThreadPoolExecutor getDefaultExecutorService() {
        return new SimpleThreadPoolExecutor();
    }

    private static MimeTypes getDefaultMimeTypes(ClassLoader classLoader) {
        return MimeTypes.getDefaultMimeTypes(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CompositeParser getDefaultParser(MimeTypes mimeTypes, ServiceLoader serviceLoader, EncodingDetector encodingDetector, Renderer renderer) {
        return new DefaultParser(mimeTypes.getMediaTypeRegistry(), serviceLoader, encodingDetector, renderer);
    }

    public static CompositeRenderer getDefaultRenderer(ServiceLoader serviceLoader) {
        return new CompositeRenderer(serviceLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Translator getDefaultTranslator(ServiceLoader serviceLoader) {
        return new DefaultTranslator(serviceLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializableProblemHandler getInitializableProblemHandler(String str) throws TikaConfigException {
        InitializableProblemHandler initializableProblemHandler = strategyMap.get(str.toUpperCase(Locale.US));
        if (initializableProblemHandler != null) {
            return initializableProblemHandler;
        }
        throw new TikaConfigException(AbstractC0279p0.l("Couldn't parse non-null '", str, "'. Must be one of 'ignore', 'info', 'warn' or 'throw'"));
    }

    public static int getMaxJsonStringFieldLength() {
        return MAX_JSON_STRING_FIELD_LENGTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getText(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1) {
            return nodeType != 3 ? "" : node.getNodeValue();
        }
        StringBuilder sb2 = new StringBuilder();
        NodeList childNodes = node.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            sb2.append(getText(childNodes.item(i5)));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Element> getTopLevelElementChildren(Element element, String str, String str2) throws TikaException {
        Node nodeItem = element;
        if (str != null) {
            NodeList elementsByTagName = element.getElementsByTagName(str);
            if (elementsByTagName.getLength() > 1) {
                throw new TikaException(AbstractC0279p0.l("Properties may not contain multiple ", str, " entries"));
            }
            nodeItem = elementsByTagName.getLength() == 1 ? elementsByTagName.item(0) : null;
        }
        if (nodeItem == null) {
            return Collections.EMPTY_LIST;
        }
        NodeList childNodes = nodeItem.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem2 = childNodes.item(i5);
            if (nodeItem2 instanceof Element) {
                Element element2 = (Element) nodeItem2;
                if (str2.equals(element2.getTagName())) {
                    arrayList.add(element2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<MediaType> mediaTypesListFromDomElement(Element element, String str) throws TikaException {
        NodeList childNodes = element.getChildNodes();
        HashSet hashSet = null;
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (str.equals(element2.getTagName())) {
                    String text = getText(element2);
                    MediaType mediaType = MediaType.parse(text);
                    if (mediaType == null) {
                        throw new TikaException(v.f("Invalid media type name: ", text));
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(mediaType);
                } else {
                    continue;
                }
            }
        }
        return hashSet != null ? hashSet : Collections.EMPTY_SET;
    }

    public static void mustNotBeEmpty(String str, String str2) throws TikaConfigException {
        if (StringUtils.isBlank(str2)) {
            throw new IllegalArgumentException(AbstractC0279p0.l("parameter '", str, "' must be set in the config file"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026 A[PHI: r3
  0x0026: PHI (r3v4 org.apache.tika.config.LoadErrorHandler) = (r3v0 org.apache.tika.config.LoadErrorHandler), (r3v3 org.apache.tika.config.LoadErrorHandler) binds: [B:5:0x0024, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.apache.tika.config.ServiceLoader serviceLoaderFromDomElement(org.w3c.dom.Element r5, java.lang.ClassLoader r6) throws org.apache.tika.exception.TikaConfigException {
        /*
            java.lang.String r0 = "service-loader"
            org.w3c.dom.Element r5 = getChild(r5, r0)
            if (r5 == 0) goto L56
            java.lang.String r0 = "dynamic"
            java.lang.String r0 = r5.getAttribute(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            org.apache.tika.config.LoadErrorHandler r1 = org.apache.tika.config.LoadErrorHandler.THROW
            java.lang.String r2 = "loadErrorHandler"
            java.lang.String r2 = r5.getAttribute(r2)
            org.apache.tika.config.LoadErrorHandler r3 = org.apache.tika.config.LoadErrorHandler.WARN
            java.lang.String r4 = r3.toString()
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L28
        L26:
            r1 = r3
            goto L40
        L28:
            java.lang.String r3 = r1.toString()
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L33
            goto L40
        L33:
            org.apache.tika.config.LoadErrorHandler r3 = org.apache.tika.config.LoadErrorHandler.IGNORE
            java.lang.String r4 = r3.toString()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L40
            goto L26
        L40:
            java.lang.String r2 = "initializableProblemHandler"
            java.lang.String r5 = r5.getAttribute(r2)
            org.apache.tika.config.InitializableProblemHandler r5 = getInitializableProblemHandler(r5)
            if (r6 != 0) goto L50
            java.lang.ClassLoader r6 = org.apache.tika.config.ServiceLoader.getContextClassLoader()
        L50:
            org.apache.tika.config.ServiceLoader r2 = new org.apache.tika.config.ServiceLoader
            r2.<init>(r6, r1, r5, r0)
            return r2
        L56:
            if (r6 == 0) goto L5e
            org.apache.tika.config.ServiceLoader r5 = new org.apache.tika.config.ServiceLoader
            r5.<init>(r6)
            return r5
        L5e:
            org.apache.tika.config.ServiceLoader r5 = new org.apache.tika.config.ServiceLoader
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.TikaConfig.serviceLoaderFromDomElement(org.w3c.dom.Element, java.lang.ClassLoader):org.apache.tika.config.ServiceLoader");
    }

    private void setMaxJsonStringFieldLength(Element element) throws TikaConfigException {
        NodeList childNodes = element.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeName().equals(MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME)) {
                try {
                    MAX_JSON_STRING_FIELD_LENGTH = Integer.parseInt(nodeItem.getTextContent());
                    return;
                } catch (NumberFormatException e7) {
                    throw new TikaConfigException(a.f(MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME, " is not an integer"), e7);
                }
            }
        }
    }

    private static MimeTypes typesFromDomElement(Element element) throws TikaException, IOException {
        Element child = getChild(element, "mimeTypeRepository");
        return (child == null || !child.hasAttribute("resource")) ? getDefaultMimeTypes(null) : MimeTypesFactory.create(child.getAttribute("resource"));
    }

    private void updateXMLReaderUtils(Element element) throws TikaException {
        Element child = getChild(element, "xml-reader-utils");
        if (child == null) {
            return;
        }
        if (child.hasAttribute("maxEntityExpansions")) {
            XMLReaderUtils.setMaxEntityExpansions(Integer.parseInt(child.getAttribute("maxEntityExpansions")));
        }
        if (child.hasAttribute("poolSize")) {
            XMLReaderUtils.setPoolSize(Integer.parseInt(child.getAttribute("poolSize")));
        }
    }

    public AutoDetectParserConfig getAutoDetectParserConfig() {
        return this.autoDetectParserConfig;
    }

    public Detector getDetector() {
        return this.detector;
    }

    public EncodingDetector getEncodingDetector() {
        return this.encodingDetector;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.mimeTypes.getMediaTypeRegistry();
    }

    public MetadataFilter getMetadataFilter() {
        return this.metadataFilter;
    }

    public MetadataListFilter getMetadataListFilter() {
        return this.metadataListFilter;
    }

    public MimeTypes getMimeRepository() {
        return this.mimeTypes;
    }

    public Parser getParser() {
        return this.parser;
    }

    public ServiceLoader getServiceLoader() {
        return this.serviceLoader;
    }

    public Translator getTranslator() {
        return this.translator;
    }

    public TikaConfig(Path path) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(path));
    }

    public TikaConfig(Path path, ServiceLoader serviceLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(path), serviceLoader);
    }

    public TikaConfig(File file) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(file.toPath()));
    }

    public TikaConfig(File file, ServiceLoader serviceLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(file.toPath()), serviceLoader);
    }

    public TikaConfig(URL url) throws TikaException, SAXException, IOException {
        this(url, ServiceLoader.getContextClassLoader());
    }

    public TikaConfig(URL url, ClassLoader classLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(url.toString()).getDocumentElement(), classLoader);
    }

    public TikaConfig(URL url, ServiceLoader serviceLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(url.toString()).getDocumentElement(), serviceLoader);
    }

    public TikaConfig(InputStream inputStream) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(inputStream));
    }

    public TikaConfig(Document document) throws TikaException, IOException {
        this(document.getDocumentElement());
    }

    public static void mustNotBeEmpty(String str, Path path) throws TikaConfigException {
        if (path == null) {
            throw new IllegalArgumentException(AbstractC0279p0.l("parameter '", str, "' must be set in the config file"));
        }
    }

    public TikaConfig(Document document, ServiceLoader serviceLoader) throws TikaException, IOException {
        this(document.getDocumentElement(), serviceLoader);
    }

    public TikaConfig(Element element) throws TikaException, IOException {
        this(element, serviceLoaderFromDomElement(element, null));
    }

    public TikaConfig(Element element, ClassLoader classLoader) throws TikaException, IOException {
        this(element, serviceLoaderFromDomElement(element, classLoader));
    }

    private TikaConfig(Element element, ServiceLoader serviceLoader) throws TikaException, IOException {
        int i5 = 0;
        DetectorXmlLoader detectorXmlLoader = new DetectorXmlLoader(i5);
        TranslatorXmlLoader translatorXmlLoader = new TranslatorXmlLoader(i5);
        ExecutorServiceXmlLoader executorServiceXmlLoader = new ExecutorServiceXmlLoader(i5);
        EncodingDetectorXmlLoader encodingDetectorXmlLoader = new EncodingDetectorXmlLoader(i5);
        RendererXmlLoader rendererXmlLoader = new RendererXmlLoader(i5);
        updateXMLReaderUtils(element);
        MimeTypes mimeTypesTypesFromDomElement = typesFromDomElement(element);
        this.mimeTypes = mimeTypesTypesFromDomElement;
        this.detector = detectorXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        EncodingDetector encodingDetectorLoadOverall = encodingDetectorXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.encodingDetector = encodingDetectorLoadOverall;
        Renderer rendererLoadOverall = rendererXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.renderer = rendererLoadOverall;
        this.parser = new ParserXmlLoader(encodingDetectorLoadOverall, rendererLoadOverall, i5).loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.translator = translatorXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.executorService = executorServiceXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.metadataFilter = MetadataFilter.load(element, true);
        this.metadataListFilter = MetadataListFilter.load(element, true);
        this.autoDetectParserConfig = AutoDetectParserConfig.load(element);
        this.serviceLoader = serviceLoader;
        setMaxJsonStringFieldLength(element);
        TIMES_INSTANTIATED.incrementAndGet();
    }

    public TikaConfig(ClassLoader classLoader) throws IOException, MimeTypeException {
        ServiceLoader serviceLoader = new ServiceLoader(classLoader);
        this.serviceLoader = serviceLoader;
        MimeTypes defaultMimeTypes = getDefaultMimeTypes(classLoader);
        this.mimeTypes = defaultMimeTypes;
        this.detector = getDefaultDetector(defaultMimeTypes, serviceLoader);
        CompositeEncodingDetector defaultEncodingDetector = getDefaultEncodingDetector(serviceLoader);
        this.encodingDetector = defaultEncodingDetector;
        CompositeRenderer defaultRenderer = getDefaultRenderer(serviceLoader);
        this.renderer = defaultRenderer;
        this.parser = getDefaultParser(defaultMimeTypes, serviceLoader, defaultEncodingDetector, defaultRenderer);
        this.translator = getDefaultTranslator(serviceLoader);
        this.executorService = getDefaultExecutorService();
        this.metadataFilter = new NoOpFilter();
        this.metadataListFilter = new NoOpListFilter();
        this.autoDetectParserConfig = AutoDetectParserConfig.DEFAULT;
        TIMES_INSTANTIATED.incrementAndGet();
    }

    public TikaConfig() throws TikaException, IOException {
        String property = System.getProperty("tika.config");
        if (!StringUtils.isBlank(property)) {
            LOG.debug("loading tika config from system property 'tika.config'");
        }
        if (StringUtils.isBlank(property)) {
            property = System.getenv("TIKA_CONFIG");
            if (!StringUtils.isBlank(property)) {
                LOG.debug("loading tika config from environment variable 'TIKA_CONFIG'");
            }
        }
        if (StringUtils.isBlank(property)) {
            LOG.debug("loading tika config from defaults; no config file specified");
            ServiceLoader serviceLoader = new ServiceLoader();
            this.serviceLoader = serviceLoader;
            MimeTypes defaultMimeTypes = getDefaultMimeTypes(ServiceLoader.getContextClassLoader());
            this.mimeTypes = defaultMimeTypes;
            CompositeEncodingDetector defaultEncodingDetector = getDefaultEncodingDetector(serviceLoader);
            this.encodingDetector = defaultEncodingDetector;
            CompositeRenderer defaultRenderer = getDefaultRenderer(serviceLoader);
            this.renderer = defaultRenderer;
            this.parser = getDefaultParser(defaultMimeTypes, serviceLoader, defaultEncodingDetector, defaultRenderer);
            this.detector = getDefaultDetector(defaultMimeTypes, serviceLoader);
            this.translator = getDefaultTranslator(serviceLoader);
            this.executorService = getDefaultExecutorService();
            this.metadataFilter = new NoOpFilter();
            this.metadataListFilter = new NoOpListFilter();
            this.autoDetectParserConfig = AutoDetectParserConfig.DEFAULT;
        } else {
            ServiceLoader serviceLoader2 = new ServiceLoader();
            LOG.debug("loading tika config from: " + property);
            try {
                InputStream configInputStream = getConfigInputStream(property, serviceLoader2);
                try {
                    Element documentElement = XMLReaderUtils.buildDOM(configInputStream).getDocumentElement();
                    updateXMLReaderUtils(documentElement);
                    ServiceLoader serviceLoaderServiceLoaderFromDomElement = serviceLoaderFromDomElement(documentElement, serviceLoader2.getLoader());
                    this.serviceLoader = serviceLoaderServiceLoaderFromDomElement;
                    int i5 = 0;
                    DetectorXmlLoader detectorXmlLoader = new DetectorXmlLoader(i5);
                    EncodingDetectorXmlLoader encodingDetectorXmlLoader = new EncodingDetectorXmlLoader(i5);
                    RendererXmlLoader rendererXmlLoader = new RendererXmlLoader(i5);
                    TranslatorXmlLoader translatorXmlLoader = new TranslatorXmlLoader(i5);
                    ExecutorServiceXmlLoader executorServiceXmlLoader = new ExecutorServiceXmlLoader(i5);
                    MimeTypes mimeTypesTypesFromDomElement = typesFromDomElement(documentElement);
                    this.mimeTypes = mimeTypesTypesFromDomElement;
                    EncodingDetector encodingDetectorLoadOverall = encodingDetectorXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.encodingDetector = encodingDetectorLoadOverall;
                    Renderer rendererLoadOverall = rendererXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.renderer = rendererLoadOverall;
                    this.parser = new ParserXmlLoader(encodingDetectorLoadOverall, rendererLoadOverall, i5).loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.detector = detectorXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.translator = translatorXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.executorService = executorServiceXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.metadataFilter = MetadataFilter.load(documentElement, true);
                    this.metadataListFilter = MetadataListFilter.load(documentElement, true);
                    this.autoDetectParserConfig = AutoDetectParserConfig.load(documentElement);
                    setMaxJsonStringFieldLength(documentElement);
                    if (configInputStream != null) {
                        configInputStream.close();
                    }
                } finally {
                }
            } catch (SAXException e7) {
                throw new TikaException(v.f("Specified Tika configuration has syntax errors: ", property), e7);
            }
        }
        TIMES_INSTANTIATED.incrementAndGet();
    }
}
