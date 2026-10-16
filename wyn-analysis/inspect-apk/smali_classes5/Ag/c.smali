.class public final LAg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg/j;


# static fields
.field public static final b:Lcg/j;


# instance fields
.field public final a:Lhb/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcg/j;->d:Lcg/j;

    .line 2
    .line 3
    const-string v0, "EFBBBF"

    .line 4
    .line 5
    invoke-static {v0}, Lab/b;->b(Ljava/lang/String;)Lcg/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LAg/c;->b:Lcg/j;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lhb/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LAg/c;->a:Lhb/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lokhttp3/ResponseBody;

    .line 2
    .line 3
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    sget-object v1, LAg/c;->b:Lcg/j;

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    invoke-interface {v0, v2, v3, v1}, Lcg/i;->e(JLcg/j;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v1, v1, Lcg/j;->a:[B

    .line 18
    .line 19
    array-length v1, v1

    .line 20
    int-to-long v1, v1

    .line 21
    invoke-interface {v0, v1, v2}, Lcg/i;->skip(J)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    new-instance v1, Lhb/x;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lhb/x;-><init>(Lcg/i;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, LAg/c;->a:Lhb/r;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1}, Lhb/x;->P()Lhb/v;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v2, Lhb/v;->j:Lhb/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    if-ne v1, v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    :try_start_1
    new-instance v0, LE5/Q;

    .line 51
    .line 52
    const-string v1, "JSON document was not fully consumed."

    .line 53
    .line 54
    const/16 v2, 0xb

    .line 55
    .line 56
    invoke-direct {v0, v1, v2}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    :goto_1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    .line 61
    .line 62
    .line 63
    throw v0
.end method
