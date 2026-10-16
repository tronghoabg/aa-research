.class public final LVa/H6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;

    .line 7
    .line 8
    sget p2, LVa/P6;->U:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x41

    .line 11
    .line 12
    rem-int/lit16 p2, p2, 0x80

    .line 13
    .line 14
    sput p2, LVa/P6;->T:I

    .line 15
    .line 16
    add-int/lit8 p2, p2, 0x53

    .line 17
    .line 18
    rem-int/lit16 p2, p2, 0x80

    .line 19
    .line 20
    sput p2, LVa/P6;->U:I

    .line 21
    .line 22
    invoke-virtual {p1}, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;->getStringTagsMap()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget p2, LVa/P6;->U:I

    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x67

    .line 29
    .line 30
    rem-int/lit16 v0, p2, 0x80

    .line 31
    .line 32
    sput v0, LVa/P6;->T:I

    .line 33
    .line 34
    rem-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    if-nez p2, :cond_0

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    throw p1
.end method
