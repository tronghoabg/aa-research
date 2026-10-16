package com.applovin.impl;

import A7.AbstractC0279p0;
import android.util.Xml;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class r8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22746a;

    /* renamed from: b, reason: collision with root package name */
    private Stack f22747b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f22748c;

    /* renamed from: d, reason: collision with root package name */
    private long f22749d;

    /* renamed from: e, reason: collision with root package name */
    private b f22750e;

    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i5, int i10) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i5, i10)).trim();
            if (StringUtils.isValidString(strTrim)) {
                r8.this.f22748c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - r8.this.f22749d;
            com.applovin.impl.sdk.o unused = r8.this.f22746a;
            if (com.applovin.impl.sdk.o.a()) {
                r8.this.f22746a.a("XmlParser", AbstractC1593a.h(seconds, "Finished parsing in ", " seconds"));
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            r8 r8Var = r8.this;
            r8Var.f22750e = (b) r8Var.f22747b.pop();
            r8.this.f22750e.d(r8.this.f22748c.toString().trim());
            r8.this.f22748c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i5, int i10) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.o unused = r8.this.f22746a;
            if (com.applovin.impl.sdk.o.a()) {
                r8.this.f22746a.a("XmlParser", "Begin parsing...");
            }
            r8.this.f22749d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !r8.this.f22747b.isEmpty() ? (b) r8.this.f22747b.peek() : null;
                b bVar2 = new b(str2, r8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                r8.this.f22747b.push(bVar2);
            } catch (Exception e7) {
                com.applovin.impl.sdk.o unused = r8.this.f22746a;
                if (com.applovin.impl.sdk.o.a()) {
                    r8.this.f22746a.a("XmlParser", AbstractC0279p0.l("Unable to process element <", str2, ">"), e7);
                }
                throw new SAXException("Failed to start element", e7);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    public static class b extends q8 {
        public b(String str, Map map, q8 q8Var) {
            super(str, map, q8Var);
        }

        public void a(q8 q8Var) {
            if (q8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f22632e.add(q8Var);
        }

        public void d(String str) {
            this.f22631d = str;
        }
    }

    public r8(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f22746a = kVar.O();
    }

    public static q8 a(String str, com.applovin.impl.sdk.k kVar) {
        return new r8(kVar).a(str);
    }

    public q8 a(String str) throws SAXException {
        if (str != null) {
            this.f22748c = new StringBuilder();
            this.f22747b = new Stack();
            this.f22750e = null;
            Xml.parse(str, new a());
            b bVar = this.f22750e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i5 = 0; i5 < length; i5++) {
                map.put(attributes.getQName(i5), attributes.getValue(i5));
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }
}
