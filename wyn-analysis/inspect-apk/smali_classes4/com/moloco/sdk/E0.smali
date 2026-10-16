.class public final Lcom/moloco/sdk/E0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Internal$ListAdapter$Converter;


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p1, Lcom/moloco/sdk/J0;->d:Lcom/moloco/sdk/J0;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    sget-object p1, Lcom/moloco/sdk/J0;->c:Lcom/moloco/sdk/J0;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    sget-object p1, Lcom/moloco/sdk/J0;->b:Lcom/moloco/sdk/J0;

    .line 24
    .line 25
    :goto_0
    if-nez p1, :cond_3

    .line 26
    .line 27
    sget-object p1, Lcom/moloco/sdk/J0;->e:Lcom/moloco/sdk/J0;

    .line 28
    .line 29
    :cond_3
    return-object p1
.end method
