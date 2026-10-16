.class public abstract LXf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:LXf/b;


# instance fields
.field public final a:LXf/h;

.field public final b:Lza/a;

.field public final c:LA/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, LXf/b;

    .line 2
    .line 3
    new-instance v1, LXf/h;

    .line 4
    .line 5
    sget-object v11, LXf/a;->b:LXf/a;

    .line 6
    .line 7
    const-string v9, "type"

    .line 8
    .line 9
    const/4 v10, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    const-string v8, "    "

    .line 17
    .line 18
    invoke-direct/range {v1 .. v11}, LXf/h;-><init>(ZZZZZZLjava/lang/String;Ljava/lang/String;ZLXf/a;)V

    .line 19
    .line 20
    .line 21
    sget-object v2, LZf/a;->a:Lza/a;

    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, LXf/c;-><init>(LXf/h;Lza/a;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, LXf/c;->d:LXf/b;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(LXf/h;Lza/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LXf/c;->a:LXf/h;

    .line 5
    .line 6
    iput-object p2, p0, LXf/c;->b:Lza/a;

    .line 7
    .line 8
    new-instance p1, LA/e0;

    .line 9
    .line 10
    const/16 p2, 0x1a

    .line 11
    .line 12
    invoke-direct {p1, p2}, LA/e0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LXf/c;->c:LA/e0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LYf/G;

    .line 12
    .line 13
    invoke-direct {v0, p1}, LYf/G;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, LYf/D;

    .line 17
    .line 18
    sget-object v1, LYf/I;->c:LYf/I;

    .line 19
    .line 20
    invoke-interface {p2}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {p1, p0, v1, v0, v2}, LYf/D;-><init>(LXf/c;LYf/I;LJ5/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, LYf/D;->z(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0}, LJ5/f;->p()V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public final b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "array"

    .line 2
    .line 3
    const-string v1, "serializer"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LA/x;

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, v2, v3}, LA/x;-><init>(IC)V

    .line 14
    .line 15
    .line 16
    sget-object v2, LYf/g;->c:LYf/g;

    .line 17
    .line 18
    const/16 v3, 0x80

    .line 19
    .line 20
    invoke-virtual {v2, v3}, LYf/f;->f(I)[C

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iput-object v3, v1, LA/x;->c:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    invoke-static {p0, v1, p1, p2}, LYf/r;->h(LXf/c;LA/x;Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, LA/x;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    iget-object p2, v1, LA/x;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p2, [C

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p2}, LYf/f;->e([C)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    sget-object p2, LYf/g;->c:LYf/g;

    .line 49
    .line 50
    iget-object v1, v1, LA/x;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, [C

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v1}, LYf/f;->e([C)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method
