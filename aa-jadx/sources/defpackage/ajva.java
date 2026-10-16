package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajva implements javax.net.ssl.HostnameVerifier {
    static java.lang.String a(java.lang.String str) throws javax.net.ssl.SSLException {
        if (str == null) {
            return null;
        }
        try {
            java.util.List rdns = new javax.naming.ldap.LdapName(str).getRdns();
            int size = rdns.size();
            while (true) {
                size--;
                if (size < 0) {
                    return null;
                }
                javax.naming.directory.Attribute attribute = ((javax.naming.ldap.Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        java.lang.Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                        continue;
                    } catch (java.util.NoSuchElementException | javax.naming.NamingException unused) {
                        continue;
                    }
                }
            }
        } catch (javax.naming.InvalidNameException unused2) {
            throw new javax.net.ssl.SSLException(str.concat(" is not a valid X500 distinguished name"));
        }
    }

    static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return java.net.InetAddress.getByName(str).getHostAddress();
        } catch (java.net.UnknownHostException unused) {
            return str;
        }
    }

    static java.util.List c(java.security.cert.X509Certificate x509Certificate) {
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return java.util.Collections.EMPTY_LIST;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List<?> list : subjectAlternativeNames) {
                java.lang.Integer num = list.size() >= 2 ? (java.lang.Integer) list.get(0) : null;
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    java.lang.Object obj = list.get(1);
                    if (obj instanceof java.lang.String) {
                        arrayList.add(new defpackage.ajve((java.lang.String) obj, num.intValue()));
                    }
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return java.util.Collections.EMPTY_LIST;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        throw null;
    }
}
