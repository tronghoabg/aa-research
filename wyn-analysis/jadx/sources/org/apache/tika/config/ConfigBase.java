package org.apache.tika.config;

import A7.AbstractC0279p0;
import N0.a;
import R8.v;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public abstract class ConfigBase {
    private static Class[] SUPPORTED_PRIMITIVES = {String.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE};

    public static class SetterClassPair {
        private final Class itemClass;
        private final Method setterMethod;

        public SetterClassPair(Method method, Class cls) {
            this.setterMethod = method;
            this.itemClass = cls;
        }

        public String toString() {
            return "SetterClassPair{setterMethod=" + this.setterMethod + ", itemClass=" + this.itemClass + "}";
        }
    }

    private static <T> T buildClass(Node node, String str, Class cls) throws DOMException, ClassNotFoundException, TikaConfigException {
        String name = cls.getName();
        Node namedItem = node.getAttributes().getNamedItem("class");
        if (namedItem != null) {
            name = namedItem.getTextContent();
        }
        try {
            Class<?> cls2 = Class.forName(name);
            if (cls.isAssignableFrom(cls2)) {
                return (T) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new TikaConfigException(str + " with class name " + name + " must be of type '" + cls.getName() + "'");
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new TikaConfigException(a.h("problem loading ", str, " with class ", cls.getName()), e);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new TikaConfigException(a.h("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new TikaConfigException(a.h("problem loading ", str, " with class ", cls.getName()), e);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new TikaConfigException(a.h("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InvocationTargetException e13) {
            e = e13;
            throw new TikaConfigException(a.h("problem loading ", str, " with class ", cls.getName()), e);
        }
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            return (P) buildComposite(str, cls, str2, cls2, XMLReaderUtils.buildDOM(inputStream).getDocumentElement());
        } catch (TikaException e7) {
            throw new TikaConfigException("problem loading xml to dom", e7);
        } catch (SAXException e10) {
            throw new IOException(e10);
        }
    }

    public static <T> T buildSingle(String str, Class<T> cls, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (documentElement.getLocalName().equals("properties")) {
                return (T) buildSingle(str, cls, documentElement, null);
            }
            throw new TikaConfigException("expect properties as root node");
        } catch (TikaException e7) {
            throw new TikaConfigException("problem loading xml to dom", e7);
        } catch (SAXException e10) {
            throw new IOException(e10);
        }
    }

    private static SetterClassPair findSetterClassPair(Object obj, String str) throws SecurityException, TikaConfigException {
        String strL = AbstractC0279p0.l("set", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        Method method = null;
        Class<?> cls = null;
        for (Method method2 : obj.getClass().getMethods()) {
            if (strL.equals(method2.getName())) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1 && (cls == null || parameterTypes[0].equals(String.class))) {
                    cls = parameterTypes[0];
                    method = method2;
                }
            }
        }
        if (method != null && cls != null) {
            return new SetterClassPair(method, cls);
        }
        String strL2 = AbstractC0279p0.l("add", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        for (Method method3 : obj.getClass().getMethods()) {
            if (strL2.equals(method3.getName())) {
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                if (parameterTypes2.length == 1 && (cls == null || parameterTypes2[0].equals(String.class))) {
                    cls = parameterTypes2[0];
                    method = method3;
                }
            }
        }
        if (method != null || cls != null) {
            return new SetterClassPair(method, cls);
        }
        Class<?> cls2 = obj.getClass();
        StringBuilder sbR = AbstractC0279p0.r("Couldn't find setter '", strL, "' or adder '", strL2, "' for ");
        sbR.append(str);
        sbR.append(" of class: ");
        sbR.append(cls2);
        throw new TikaConfigException(sbR.toString());
    }

    private static boolean hasChildNodes(Node node) {
        if (!node.hasChildNodes()) {
            return false;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            if (childNodes.item(i5).getNodeType() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasClass(Node node) {
        return node.hasAttributes() && node.getAttributes().getNamedItem("class") != null;
    }

    private static boolean isMap(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1 && nodeItem.hasAttributes()) {
                if (nodeItem.getAttributes().getNamedItem("from") != null && nodeItem.getAttributes().getNamedItem("to") != null) {
                    return true;
                }
                if (nodeItem.getAttributes().getNamedItem("k") != null && nodeItem.getAttributes().getNamedItem("v") != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrimitive(Class cls) {
        int i5 = 0;
        while (true) {
            Class[] clsArr = SUPPORTED_PRIMITIVES;
            if (i5 >= clsArr.length) {
                return false;
            }
            if (clsArr[i5].equals(cls)) {
                return true;
            }
            i5++;
        }
    }

    private static <T> List<T> loadComposite(Node node, String str, Class<? extends T> cls) throws IllegalAccessException, DOMException, ClassNotFoundException, SecurityException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                Object objBuildClass = buildClass(nodeItem, str, cls);
                setParams(objBuildClass, nodeItem, new HashSet());
                arrayList.add(objBuildClass);
            }
        }
        return arrayList;
    }

    private static void setParams(Object obj, Node node, Set<String> set) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        setParams(obj, node, set, null);
    }

    private static void tryToSetClassList(Object obj, Node node) throws IllegalAccessException, DOMException, ClassNotFoundException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        String localName = node.getLocalName();
        try {
            Class<?> cls = Class.forName(node.getAttributes().getNamedItem("class").getTextContent());
            ArrayList arrayList = new ArrayList();
            NodeList childNodes = node.getChildNodes();
            for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
                Node nodeItem = childNodes.item(i5);
                if (nodeItem.getNodeType() == 1) {
                    Object objBuildClass = buildClass(nodeItem, nodeItem.getLocalName(), cls);
                    setParams(objBuildClass, nodeItem, new HashSet());
                    arrayList.add(objBuildClass);
                }
            }
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), List.class).invoke(obj, arrayList);
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new TikaConfigException(v.f("couldn't build class for ", localName), e);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new TikaConfigException(v.f("couldn't build class for ", localName), e);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new TikaConfigException(v.f("couldn't build class for ", localName), e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new TikaConfigException(v.f("couldn't build class for ", localName), e);
        }
    }

    private static void tryToSetList(Object obj, Node node) throws IllegalAccessException, DOMException, ClassNotFoundException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        if (hasClass(node)) {
            tryToSetClassList(obj, node);
        } else {
            tryToSetStringList(obj, node);
        }
    }

    private static void tryToSetMap(Object obj, Node node) throws IllegalAccessException, DOMException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        String localName = node.getLocalName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NodeList childNodes = node.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1) {
                NamedNodeMap attributes = nodeItem.getAttributes();
                String textContent = null;
                String textContent2 = attributes.getNamedItem("from") != null ? attributes.getNamedItem("from").getTextContent() : attributes.getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) != null ? attributes.getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR).getTextContent() : attributes.getNamedItem("k") != null ? attributes.getNamedItem("k").getTextContent() : null;
                if (attributes.getNamedItem("to") != null) {
                    textContent = attributes.getNamedItem("to").getTextContent();
                } else if (attributes.getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) != null) {
                    textContent = attributes.getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR).getTextContent();
                } else if (attributes.getNamedItem("v") != null) {
                    textContent = attributes.getNamedItem("v").getTextContent();
                }
                if (textContent2 == null) {
                    throw new TikaConfigException("must specify a 'key' or 'from' value in a map object : " + node);
                }
                if (textContent == null) {
                    throw new TikaConfigException("must specify a 'value' or 'to' value in a map object : " + node);
                }
                linkedHashMap.put(textContent2, textContent);
            }
        }
        try {
            obj.getClass().getMethod(AbstractC0279p0.l("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), Map.class).invoke(obj, linkedHashMap);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new TikaConfigException("can't set ".concat(localName), e7);
        }
    }

    private static void tryToSetPrimitive(Object obj, SetterClassPair setterClassPair, String str) throws IllegalAccessException, IllegalArgumentException, TikaConfigException, InvocationTargetException {
        try {
            if (setterClassPair.itemClass == Integer.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (setterClassPair.itemClass == Long.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Long.valueOf(Long.parseLong(str)));
                return;
            }
            if (setterClassPair.itemClass == Float.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Float.valueOf(Float.parseFloat(str)));
                return;
            }
            if (setterClassPair.itemClass == Double.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Double.valueOf(Double.parseDouble(str)));
            } else if (setterClassPair.itemClass == Boolean.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                setterClassPair.setterMethod.invoke(obj, str);
            }
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new TikaConfigException("bad parameter " + setterClassPair + StringUtils.SPACE + str, e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new TikaConfigException("bad parameter " + setterClassPair + StringUtils.SPACE + str, e);
        }
    }

    private static void tryToSetStringList(Object obj, Node node) throws IllegalAccessException, IllegalArgumentException, TikaConfigException, InvocationTargetException {
        String textContent;
        String localName = node.getLocalName();
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1 && (textContent = nodeItem.getTextContent()) != null) {
                arrayList.add(textContent);
            }
        }
        try {
            obj.getClass().getMethod(AbstractC0279p0.l("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), List.class).invoke(obj, arrayList);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new TikaConfigException("can't set ".concat(localName), e7);
        }
    }

    public Set<String> configure(String str, InputStream inputStream) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        HashSet hashSet = new HashSet();
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (!documentElement.getLocalName().equals("properties")) {
                throw new TikaConfigException("expect properties as root node");
            }
            NodeList childNodes = documentElement.getChildNodes();
            for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
                Node nodeItem = childNodes.item(i5);
                if (str.equals(nodeItem.getLocalName())) {
                    setParams(this, nodeItem, hashSet);
                }
            }
            return hashSet;
        } catch (TikaException e7) {
            throw new TikaConfigException("problem loading xml to dom", e7);
        } catch (SAXException e10) {
            throw new IOException(e10);
        }
    }

    public void handleSettings(Set<String> set) {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void setParams(java.lang.Object r11, org.w3c.dom.Node r12, java.util.Set<java.lang.String> r13, java.lang.String r14) throws java.lang.IllegalAccessException, org.w3c.dom.DOMException, java.lang.SecurityException, java.lang.ClassNotFoundException, org.apache.tika.exception.TikaConfigException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r0 = 1
            org.w3c.dom.NodeList r12 = r12.getChildNodes()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        Lc:
            int r4 = r12.getLength()
            if (r3 >= r4) goto L3b
            org.w3c.dom.Node r4 = r12.item(r3)
            java.lang.String r5 = r4.getLocalName()
            java.lang.String r6 = "params"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L36
            org.w3c.dom.NodeList r4 = r4.getChildNodes()
            r5 = r2
        L27:
            int r6 = r4.getLength()
            if (r5 >= r6) goto L39
            org.w3c.dom.Node r6 = r4.item(r5)
            r1.add(r6)
            int r5 = r5 + r0
            goto L27
        L36:
            r1.add(r4)
        L39:
            int r3 = r3 + r0
            goto Lc
        L3b:
            r12 = r2
        L3c:
            int r3 = r1.size()
            if (r12 >= r3) goto Le3
            java.lang.Object r3 = r1.get(r12)
            org.w3c.dom.Node r3 = (org.w3c.dom.Node) r3
            short r4 = r3.getNodeType()
            if (r4 == r0) goto L50
            goto Le0
        L50:
            java.lang.String r4 = r3.getLocalName()
            if (r4 == 0) goto Le0
            boolean r5 = r4.equals(r14)
            if (r5 == 0) goto L5e
            goto Le0
        L5e:
            java.lang.String r5 = r3.getTextContent()
            java.lang.String r6 = r3.getLocalName()
            org.apache.tika.config.ConfigBase$SetterClassPair r7 = findSetterClassPair(r11, r6)
            boolean r8 = hasClass(r3)
            if (r8 != 0) goto L96
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L86
            boolean r8 = isMap(r3)
            if (r8 == 0) goto L86
            tryToSetMap(r11, r3)
            goto Lcb
        L86:
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Class<java.util.List> r9 = java.util.List.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L96
            tryToSetList(r11, r3)
            goto Lcb
        L96:
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            boolean r8 = isPrimitive(r8)
            if (r8 == 0) goto La8
            java.lang.String r3 = r3.getTextContent()
            tryToSetPrimitive(r11, r7, r3)
            goto Lcb
        La8:
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Object r8 = buildClass(r3, r6, r8)
            java.lang.Class r9 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Object r9 = r9.cast(r8)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            setParams(r9, r3, r10)
            java.lang.reflect.Method r3 = org.apache.tika.config.ConfigBase.SetterClassPair.b(r7)     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
            r7[r2] = r8     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
            r3.invoke(r11, r7)     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
        Lcb:
            if (r5 == 0) goto Le0
            r13.add(r4)
            goto Le0
        Ld1:
            r11 = move-exception
            goto Ld4
        Ld3:
            r11 = move-exception
        Ld4:
            org.apache.tika.exception.TikaConfigException r12 = new org.apache.tika.exception.TikaConfigException
            java.lang.String r13 = "problem creating "
            java.lang.String r13 = R8.v.f(r13, r6)
            r12.<init>(r13, r11)
            throw r12
        Le0:
            int r12 = r12 + r0
            goto L3c
        Le3:
            boolean r12 = r11 instanceof org.apache.tika.config.Initializable
            if (r12 == 0) goto Lf3
            org.apache.tika.config.Initializable r11 = (org.apache.tika.config.Initializable) r11
            java.util.Map r12 = java.util.Collections.EMPTY_MAP
            r11.initialize(r12)
            org.apache.tika.config.InitializableProblemHandler r12 = org.apache.tika.config.InitializableProblemHandler.THROW
            r11.checkInitialization(r12)
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.ConfigBase.setParams(java.lang.Object, org.w3c.dom.Node, java.util.Set, java.lang.String):void");
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, Element element) throws IllegalAccessException, DOMException, InstantiationException, ClassNotFoundException, SecurityException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        if (element.getLocalName().equals("properties")) {
            NodeList childNodes = element.getChildNodes();
            for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
                Node nodeItem = childNodes.item(i5);
                if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                    try {
                        try {
                            P pNewInstance = cls.getConstructor(List.class).newInstance(loadComposite(nodeItem, str2, cls2));
                            setParams(pNewInstance, nodeItem, new HashSet(), str2);
                            return pNewInstance;
                        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
                            e = e7;
                            throw new TikaConfigException("can't build composite class", e);
                        }
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        throw new TikaConfigException("can't build composite class", e);
                    } catch (InstantiationException e11) {
                        e = e11;
                        throw new TikaConfigException("can't build composite class", e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        throw new TikaConfigException("can't build composite class", e);
                    }
                }
            }
            throw new TikaConfigException(v.f("could not find ", str));
        }
        throw new TikaConfigException("expect properties as root node");
    }

    public static <T> T buildSingle(String str, Class<T> cls, Element element, T t10) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        NodeList childNodes = element.getChildNodes();
        T t11 = null;
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                if (t11 == null) {
                    t11 = (T) buildClass(nodeItem, str, cls);
                    setParams(t11, nodeItem, new HashSet());
                } else {
                    throw new TikaConfigException(AbstractC0279p0.l("There can only be one ", str, " in a config"));
                }
            }
        }
        if (t11 != null) {
            return t11;
        }
        if (t10 != null) {
            return t10;
        }
        throw new TikaConfigException(v.f("could not find ", str));
    }
}
