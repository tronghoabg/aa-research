.class public final LVa/u3;
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
    check-cast p1, Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;

    .line 7
    .line 8
    sget p2, LVa/w3;->U:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x9

    .line 11
    .line 12
    rem-int/lit16 v0, p2, 0x80

    .line 13
    .line 14
    sput v0, LVa/w3;->T:I

    .line 15
    .line 16
    rem-int/lit8 p2, p2, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p1}, LVa/w3;->H0(Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;)V

    .line 20
    .line 21
    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    sget p1, LVa/w3;->T:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x5f

    .line 27
    .line 28
    rem-int/lit16 p1, p1, 0x80

    .line 29
    .line 30
    sput p1, LVa/w3;->U:I

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    throw v0
.end method
