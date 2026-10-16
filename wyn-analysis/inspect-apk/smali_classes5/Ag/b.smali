.class public final LAg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg/j;


# static fields
.field public static final b:Lokhttp3/MediaType;


# instance fields
.field public final a:Lhb/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/MediaType;->d:Lokhttp3/MediaType$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "application/json; charset=UTF-8"

    .line 7
    .line 8
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, LAg/b;->b:Lokhttp3/MediaType;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lhb/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LAg/b;->a:Lhb/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lhb/y;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lhb/y;-><init>(Lcg/h;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LAg/b;->a:Lhb/r;

    .line 12
    .line 13
    invoke-virtual {v2, v1, p1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-wide v1, v0, Lcg/g;->b:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lcg/g;->z(J)Lcg/j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, LAg/b;->b:Lokhttp3/MediaType;

    .line 23
    .line 24
    invoke-static {v0, p1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Lcg/j;)Lokhttp3/RequestBody;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method
