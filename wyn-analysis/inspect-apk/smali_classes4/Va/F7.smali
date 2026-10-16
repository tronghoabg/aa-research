.class public final LVa/F7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/ua;


# instance fields
.field public synthetic a:LVa/r8;

.field public synthetic b:LVa/x8;

.field public synthetic c:LVa/y7;


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-object p1, v0, v1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    aput-object p2, v0, p1

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p2, p0, LVa/F7;->b:LVa/x8;

    .line 15
    .line 16
    iget-object v0, p0, LVa/F7;->c:LVa/y7;

    .line 17
    .line 18
    iget-object v1, p0, LVa/F7;->a:LVa/r8;

    .line 19
    .line 20
    invoke-virtual {v1, p2, v0, p1}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, LVa/s8;->c()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lorg/json/JSONObject;

    .line 29
    .line 30
    return-object p1
.end method
