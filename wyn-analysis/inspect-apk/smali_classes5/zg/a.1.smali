.class public final Lzg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg/j;


# static fields
.field public static final b:Lzg/a;

.field public static final c:Lzg/a;

.field public static final d:Lzg/a;

.field public static final e:Lzg/a;

.field public static final f:Lzg/a;

.field public static final g:Lzg/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzg/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lzg/a;->b:Lzg/a;

    .line 8
    .line 9
    new-instance v0, Lzg/a;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lzg/a;->c:Lzg/a;

    .line 16
    .line 17
    new-instance v0, Lzg/a;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lzg/a;->d:Lzg/a;

    .line 24
    .line 25
    new-instance v0, Lzg/a;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lzg/a;->e:Lzg/a;

    .line 32
    .line 33
    new-instance v0, Lzg/a;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lzg/a;->f:Lzg/a;

    .line 40
    .line 41
    new-instance v0, Lzg/a;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lzg/a;->g:Lzg/a;

    .line 48
    .line 49
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lzg/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lzg/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lokhttp3/ResponseBody;

    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :pswitch_0
    check-cast p1, Lokhttp3/ResponseBody;

    .line 14
    .line 15
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lef/C;->a:Lef/C;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_1
    check-cast p1, Lokhttp3/ResponseBody;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_2
    check-cast p1, Lokhttp3/RequestBody;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_3
    check-cast p1, Lokhttp3/ResponseBody;

    .line 28
    .line 29
    :try_start_0
    new-instance v0, Lcg/g;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1, v0}, Lcg/i;->F(Lcg/h;)J

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentLength()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    invoke-static {v1, v2, v3, v0}, Lokhttp3/ResponseBody;->create(Lokhttp3/MediaType;JLcg/i;)Lokhttp3/ResponseBody;

    .line 50
    .line 51
    .line 52
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
