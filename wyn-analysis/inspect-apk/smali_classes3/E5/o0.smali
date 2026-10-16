.class public LE5/o0;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, LE5/o0;->a:Z

    .line 5
    .line 6
    iput p4, p0, LE5/o0;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;
    .locals 2

    .line 1
    new-instance v0, LE5/o0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1, v1}, LE5/o0;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static b(Ljava/lang/String;)LE5/o0;
    .locals 4

    .line 1
    new-instance v0, LE5/o0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, p0, v2, v3, v1}, LE5/o0;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
