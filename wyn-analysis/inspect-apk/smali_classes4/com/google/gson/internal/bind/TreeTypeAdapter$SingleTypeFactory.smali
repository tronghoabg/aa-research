.class final Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lla/A;


# instance fields
.field public final a:Lqa/a;

.field public final b:Z

.field public final c:Lla/n;


# direct methods
.method public constructor <init>(Lcom/dexterous/flutterlocalnotifications/models/ScheduleMode$Deserializer;Lqa/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->c:Lla/n;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->a:Lqa/a;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->b:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final create(Lla/l;Lqa/a;)Lla/z;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->a:Lqa/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {v0, p2}, Lqa/a;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    iget-boolean v2, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->b:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p2, Lqa/a;->a:Ljava/lang/Class;

    .line 17
    .line 18
    iget-object v0, v0, Lqa/a;->b:Ljava/lang/reflect/Type;

    .line 19
    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v1

    .line 24
    :cond_1
    :goto_0
    new-instance v3, Lcom/google/gson/internal/bind/u;

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    iget-object v4, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;->c:Lla/n;

    .line 28
    .line 29
    move-object v7, p0

    .line 30
    move-object v5, p1

    .line 31
    move-object v6, p2

    .line 32
    invoke-direct/range {v3 .. v8}, Lcom/google/gson/internal/bind/u;-><init>(Lla/n;Lla/l;Lqa/a;Lla/A;Z)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_2
    move-object v6, p2

    .line 37
    iget-object p1, v6, Lqa/a;->a:Ljava/lang/Class;

    .line 38
    .line 39
    throw v1
.end method
