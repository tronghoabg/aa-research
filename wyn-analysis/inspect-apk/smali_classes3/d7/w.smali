.class public Ld7/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ld7/w;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ld7/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v1}, Ld7/w;-><init>(Ljava/lang/String;ZLjava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ld7/w;->d:Ld7/w;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Ld7/w;->a:Z

    .line 5
    .line 6
    iput-object p1, p0, Ld7/w;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ld7/w;->c:Ljava/lang/Exception;

    .line 9
    .line 10
    return-void
.end method

.method public static b(Ljava/lang/String;)Ld7/w;
    .locals 3

    .line 1
    new-instance v0, Ld7/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v2, v1}, Ld7/w;-><init>(Ljava/lang/String;ZLjava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/Exception;)Ld7/w;
    .locals 2

    .line 1
    new-instance v0, Ld7/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1, p1}, Ld7/w;-><init>(Ljava/lang/String;ZLjava/lang/Exception;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/w;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
